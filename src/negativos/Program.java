package negativos;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar: ");
		int n = sc.nextInt();

		int [] vect = new int [n];
		
		for (int i = 0 ; i < n ; i++) {
			System.out.println("digite um numero: ");
			vect[i] = sc.nextInt();
		}
			System.out.println("numeros negativos");
			for (int i = 0 ; i < n ; i++) {
				if (vect[i] < 0) {
					System.out.println(vect[i]);
				}
			}
		
		
		sc.close();
	}

}
