package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int escolha, triangulo, circulo, quadrado, base, altura, comprimento, largura, raio;

        System.out.println("Calcular a área das formas geométricas");
        System.out.println("Escolha qual forma deseja calcular:");
        System.out.println("Triangulo: 1");
        System.out.println("Quadrado: 2");
        System.out.println("Círculo: 3");

        escolha = entrada.nextInt();

        if ( escolha == 1 ) {
            System.out.println(" Vamos calcular a área de um triângulo");
            System.out.println("Insira as medidas do triangulo:");
            System.out.println("Base:");
            base = entrada.nextInt();
            System.out.println("Altura:");
            altura = entrada.nextInt();

            double area = (0.5*base*altura);

            System.out.println("A área do triângulo é:" + area);

        } else if ( escolha == 2) {
            System.out.println(" Vamos calcular a área de um quadrado");
            System.out.println("Insira as medidas do quadrado:");
            System.out.println("Comprimento:");
            comprimento= entrada.nextInt();
            System.out.println("Largura:");
            largura = entrada.nextInt();

            double area = (comprimento*largura);

            System.out.println("A área do quadrado é:" + area);

        } else if ( escolha == 3 ) {
            System.out.println("Vamos calcular a área de um círculo");
            System.out.println("Insira as medidas do círculo:");
            System.out.println("Raio:");
            raio= entrada.nextInt();

            double area = (3.14 * (raio*raio));

            System.out.println("A área do círculo é:" + area);


        }else {
            System.out.println("Escolha inválida, tente novamente!");
        }

    }
}
