package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	double celsius, fahrenheit;

	System.out.println("Conversor de temperaturas!");
	System.out.println("Digite a temperatura em graus Celsius:");
	celsius = entrada.nextInt();

	fahrenheit = ((celsius*9)/5)+32;

	System.out.println("A temperatura de " + celsius + " em Fahrenheit é: " + fahrenheit);

	}
}
