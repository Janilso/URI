package URI;

import java.util.Scanner;

public class Q1332 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
	
		char[] vet = null;
		int q = ent.nextInt();
		String p = "";
		System.out.println();
		
		
		for (int i = 0; i < q; i++) {
			int res = 0;
			p = ent.next();
			for (int j = 0; j < p.length(); j++)
				vet = p.toCharArray();
			
			if(vet.length == 3) {
				
				if (vet[1] == 'o') {
					res = 1;
				}
				else if (vet[2] == 'n') {
					res = 1;					
				}
				else if (vet[3] == 'e') {
					res = 1;					
				}
			}
			System.out.println(res);
		}
	}

}
