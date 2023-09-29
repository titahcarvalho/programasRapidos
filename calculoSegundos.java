package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Vamos calcular o tempo a partir dos segundos");
        System.out.println("Digite um valor em segundos:");
        double tempoSegundos = entrada.nextDouble();

        double dias,horas, minutos, segundos;

        dias = tempoSegundos/ 86400;
        tempoSegundos = tempoSegundos % 86400;

        horas = tempoSegundos/3600;
        tempoSegundos = tempoSegundos % 3600;

        minutos = tempoSegundos/60;
        tempoSegundos =tempoSegundos%60;

        segundos = tempoSegundos;

        System.out.println("E o tempo equivalente de " + tempoSegundos + " em dias, horas, minutos é:");
        System.out.println("Dias: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);




    }
}
