package application;

import java.util.Locale;
import java.util.Scanner;

import util.Alturas;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Alturas[] vect = new Alturas[n];
		
		for(int i=0; i<vect.length; i++) {
			System.out.print("Altura da "+(i+1)+ "a pessoa: ");
			double altura = sc.nextDouble();
			System.out.print("Genero da "+(i+1) +"a pessoa: ");
			char sexo = sc.next().toUpperCase().charAt(0);
			sc.nextLine();
			vect[i] = new Alturas(altura, sexo);
		}
		
		double maior = vect[0].getAltura();
		double menor = vect[0].getAltura();
		double countFeminino = 0;
		double countMasculino = 0;
		double sumF = 0;
		
		for(int i=0; i<vect.length; i++) {
			if (vect[i].getAltura() > maior) {
				maior = vect[i].getAltura();
			}
			
			if (vect[i].getAltura() < menor) {
				menor = vect[i].getAltura();
			}
			
			if(vect[i].getSexo() == 'F') {
				countFeminino += 1;
				sumF += vect[i].getAltura();
			}
			
			if (vect[i].getSexo() == 'M'){
				countMasculino += 1;
			}
		}
		
		double alturaFeminina = 0;
		if(countFeminino != 0) {
			 alturaFeminina = sumF / countFeminino;
		}
		else {
			alturaFeminina = 0;
		}
		
		System.out.println("Menor altura = " + menor);
		System.out.println("Maior altura = " + maior);
		System.out.printf("Media das alturas das mulheres = %.2f%n", alturaFeminina);
		System.out.printf("Numero de Homens = %.0f%n", countMasculino);

		sc.close();
	}

}
