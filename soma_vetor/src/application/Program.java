package application;

import java.util.Locale;
import java.util.Scanner;

import entities.SumVect;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		SumVect[] vect = new SumVect[n];
	
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			double value = sc.nextDouble();
			vect[i] = new SumVect(value);
		}
		
		System.out.println();
		System.out.print("VALORES = ");
		double sum = 0;
		for(int i=0; i<vect.length; i++) {
			sum += vect[i].getNum();
			System.out.print(vect[i].getNum() + " ");
		}
	
		System.out.println();
		System.out.println("SOMA = " + sum);
		double media = sum / vect.length;
		System.out.println("MEDIA = " + media);
		
		
		
		
		sc.close();
	}

}
