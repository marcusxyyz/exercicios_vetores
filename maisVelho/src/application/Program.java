package application;

import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		People[] vect = new People[n];
		
		for(int i=0; i<vect.length; i++) {
			System.out.println("Dados da "+ (i + 1) + "a pessoa: ");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			vect[i] = new People(name, idade);
		}
		
		String pessoaMaisVelha = "";
		int maisVelho = vect[0].getIdade();
		for(int i=0; i<vect.length; i++) {
			if(vect[i].getIdade() > maisVelho) {
				maisVelho = vect[i].getIdade();
				pessoaMaisVelha = vect[i].getName();
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + pessoaMaisVelha);
		
		sc.close();
	}

}
