package exercicios;

import java.util.Scanner;

public class exPro3Sec5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int valor1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int valor2 = sc.nextInt();
        if (valor1 % valor2 == 0  || valor2 % valor1 == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }
        sc.close();
    }
}