package application;

import java.util.Locale;
import java.util.Scanner;

import util.People;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitas? ");
		int n = sc.nextInt();
		People[] vect = new People[n];
		
		for(int i=0; i<vect.length; i++) {
			System.out.println("Dados da "+ (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new People(nome, idade, altura);
		}
		
		System.out.println();
		
		double soma = 0;
		double menorIdade16 = 0;
		for(int i=0; i<vect.length; i++) {
			soma += vect[i].getAltura();
			
			if (vect[i].getIdade() < 16) {
				menorIdade16 += 1;
			}
		}
		
		double porcentagemMenorIdade = 0.0;
		
		double avgAltura = soma / vect.length;
		if(menorIdade16 > 0) {
			porcentagemMenorIdade = menorIdade16 * 100 / vect.length;
		}
		
		
		System.out.printf("Altura media: %.2f%n", avgAltura);
		
		
		System.out.printf("Pessoas com menos de 16 anos: %.2f %n", porcentagemMenorIdade);
		
		for(int i=0; i<vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		
		sc.close();
	}

}
