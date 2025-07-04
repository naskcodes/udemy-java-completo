package exercicios;

import java.util.Scanner;

public class exPro2sec4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");
        double raio = sc.nextDouble();
        double pi = Math.PI;
        double area = pi * Math.pow(raio, 2);
        System.out.printf("Área do círculo: %.4f", area);
        sc.close();
    }
}