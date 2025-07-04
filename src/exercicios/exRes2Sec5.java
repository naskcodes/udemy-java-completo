package exercicios;

import java.util.Scanner;

public class exRes2Sec5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double valor1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double valor2 = sc.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double valor3 = sc.nextDouble();
        double delta = Math.pow(valor2, 2) - 4 * valor1 * valor3;
        double raiz1 = (-valor2 - Math.sqrt(delta))/(2 * valor1);
        double raiz2 = (-valor2 + Math.sqrt(delta))/(2 * valor1);
        //Correção: considerando que apenas o valor1 ou a irá na divisão, a resposta deveria ficar com if (delta < 0 || valor1 == 0)
        if (delta < 0 || valor1 == 0 || valor2 == 0 || valor3 == 0) {
            System.out.println("Impossível calcular");
        } else {
            System.out.printf("R1 = %.5f%nR2 = %.5f", raiz1, raiz2);
        }
        sc.close();
    }
}
