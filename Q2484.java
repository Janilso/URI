package URI;

import java.util.Scanner;

public class Q2484 {

	public static void main(String[] args) {
		
		Scanner ent =  new Scanner(System.in);
		
		while( ent.hasNext()) {
			String espaco = "";
			String p = ent.next();
			
			for (int i = 0; i < p.length(); i++) {
				for (int j = 0; j < p.length()-i; j++) {
					if (j == 0) 
						System.out.print(espaco); 
					if (j == (p.length())-(i+1)) 
						System.out.print(p.charAt(j));
					else
						System.out.print(p.charAt(j)+" "); 
				}
				espaco += " ";
				System.out.println();
			}
			System.out.println();
		}

	}

}