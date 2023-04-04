package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vetorPares = new int[n];
		
		int count = 0;
		for (int i=0; i<vetorPares.length; i++) {
			System.out.print("Digite um numero: ");
			int num = sc.nextInt();
			vetorPares[i] = num;
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES:");
		for(int i=0; i<vetorPares.length; i++) {
			if(vetorPares[i] % 2 == 0) {
				System.out.print(vetorPares[i] + " ");
				count += 1;
			}
			
		}
		
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = "+ count);
		
		sc.close();
	}

}
