package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		double sumPares = 0;
		int contPares = 0;
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			
			if (vect[i] % 2 == 0) {
				sumPares += vect[i];
				contPares += 1;
			}
		}
		
		double media = 0;
		
		if(contPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			media = sumPares / contPares;
			System.out.printf("MEDIA DOS PARES = %.1f%n", media);
		}
		
		sc.close();
	}

}
