package dioIde;

import java.util.Scanner;

public class dioAatalhos {

	public static void main(String[] args) {	
		Scanner scan = new Scanner (System.in);
		int a, b ;
		
		System.out.println("Digite o Primeiro valor");
		a= scan.nextInt();
		System.out.println("Digite o Segundo valor");
		b= scan.nextInt();
		
		
		int soma = soma(a, b);
		int subtracao = subtracao(a, b);
		double divisao = divisao(a, b);
		int multiplicasao= multiplicasao(a, b);
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(divisao);
		System.out.println(multiplicasao);
	}
	
	public static int soma(int a, int b) {
		
		return a + b ;
	}
	
	
	public static int subtracao(int a, int b) {
		
		return a - b ;
	}
	
	
	public static double divisao(int a, int b) {
		
		return a/b ;
	}
	
	
	public static int multiplicasao(int a, int b) {
		
		return a*b ;
	}
	
	
	
	
	
	
	

}
