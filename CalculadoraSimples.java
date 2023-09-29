package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int numero1, numero2, soma, subtracao1, subtracao2, divisao1, divisao2, resto1, resto2;
	//char letra = '\u0045';
	System.out.println("Digite o primeiro número:");
	numero1 = entrada.nextInt();

	System.out.println("Digite o segundo número:");
	numero2 = entrada.nextInt();

	soma = numero1 + numero2;
	subtracao1 = numero1 - numero2;
	subtracao2 = numero2 - numero1;
	divisao1 = numero1/numero2;
	divisao2 = numero2/numero1;
	resto1 = numero1%numero2;
	resto2 = numero2%numero1;

		System.out.println("O resultado das operações entre " + numero1 + " e " + numero2 + " é:");
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + subtracao1 + " ou " + subtracao2);
		System.out.println("Divisão: " + divisao1 + " ou " + divisao2);
		System.out.println("Resto: " + resto1 + " ou " + resto2);


	}
}