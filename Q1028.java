package URI;

import java.util.Scanner;

public class Q1028 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		int nc = ent.nextInt(),
			j1,
			j2,
			maior,
			menor,
			res;
		
		for (int i = 0; i < nc; i++) {
			
			j1 = ent.nextInt();
			j2 = ent.nextInt();
			
			maior = Math.max(j1, j2);
			menor = Math.min(j1, j2);
			res = maior%menor;
			
			if (res == 0) {
				System.out.println(menor);
			} else {
				menor %= res;
				
				for (int j = 0; j < args.length; j++) {
					if (menor == 0) break;
					else menor = res%menor;
				}
				System.out.println(res);
			}
			
		}
		
	}

}
