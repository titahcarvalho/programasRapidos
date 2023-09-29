package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);

	System.out.println("Entre com os seguintes dados:");
	System.out.println("Capital Inicial:");
	double capitalInicial = entrada.nextDouble();

	System.out.println("O valor da taxa de juros:");
	double taxa = entrada.nextDouble()/100;


	System.out.println("O período em meses:");
	int tempo = entrada.nextInt();

	double montanteFinal = capitalInicial*(1+(taxa*tempo));

	System.out.println("O Montante final que você terá com o Juros Simples é: " + montanteFinal);

	}
}
