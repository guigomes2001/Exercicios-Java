package Java_Loops;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		//Leitor básico de comparação > <
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe 5 números para que o programa retorne o maior deles: ");
		double num1 = leitor.nextDouble();
		double num2 = leitor.nextDouble();
		double num3 = leitor.nextDouble();
		double num4 = leitor.nextDouble();
		double num5 = leitor.nextDouble();
		
		if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
			System.out.println("O maior número é o " + num1);
		} else if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
			System.out.println("O maior número é o " + num2);
		} else if(num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
			System.out.println("O maior número é o " + num3);
		} else if(num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
			System.out.println("O maior número é o " + num4);
		} else {
			System.out.println("O maior número é o " + num5);
		}
		
		leitor.close();

	}

}
