package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			double num = sc.nextDouble();
			vect[i] = num;
		}
	
		double max = vect[0];
		int pos = 0;
		for(int i=0; i<vect.length; i++) {
			if (vect[i] > max) {
				max = vect[i];
				pos = i;
			}
		}
		
		
		System.out.println();
		System.out.println("MAIOR VALOR = " + max);
		System.out.println("POSICAO DO MAIOR VALOR = "+ pos);
		
	
		sc.close();
	}

}
