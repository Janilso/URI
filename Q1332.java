package URI;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1332 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
	
		int q = ent.nextInt();
		String p = "";
				
		for (int i = 0; i < q; i++) {
			int res = 0;
			p = ent.next();
			
			if(p.length() == 3) {
				
				if (p.startsWith("o") == true || p.endsWith("e") == true) {
					res = 1;
				}
				else if (p.startsWith("t") == true || p.endsWith("o") == true){
					res = 2;					
				}
	
			}
			else if (p.length() == 5){
				res = 3;
			}
			System.out.println(res);
		}
	}

}
