package exercicios;

import java.util.Scanner;

public class exPro1sec4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int valor1 = sc.nextInt();
        System.out.println("Digite um segundo número inteiro: ");
        int valor2 = sc.nextInt();
        int soma = valor1 + valor2;
        System.out.println("Soma = " + soma);

        //Correção: Faltou o "sc.close();" de novo
    }
}