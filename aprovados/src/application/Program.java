package application;

import java.util.Locale;
import java.util.Scanner;

import util.Alunos;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		Alunos[] vect = new Alunos[n];
		double[] soma = new double[n];
		double[] media = new double[n];
		for(int i=0; i<vect.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do "+(i+1)+"o aluno:");
			sc.nextLine();
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			vect[i] = new Alunos(nome, nota1, nota2);
		}
		
		for(int i=0; i<vect.length; i++) {
			soma[i] += vect[i].getPrimeiraNota() +vect[i].getSegundaNota();
		}
		
		for(int i=0; i<media.length; i++) {
			media[i] = soma[i] / 2.0;
		}
		
		System.out.println("Alunos aprovados:");
		for(int i=0; i<media.length;i++) {
			if(media[i] >= 6.0) {
				System.out.println(vect[i].getNome());
			}
		}
		
		sc.close();
	}

}
