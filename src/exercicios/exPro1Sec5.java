package exercicios;

import java.util.Scanner;

public class exPro1Sec5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int valor = sc.nextInt();
        if (valor < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Não negativo");
        }
        sc.close();
    }
}