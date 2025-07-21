package exercicios;

import java.util.Scanner;

public class exResFor2Sec6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = sc.nextInt();
        int soma = 0;
        if (!(valor1 % 2 == 0)) {
            soma = soma + valor1;
        }
        if (!(valor2 % 2 == 0)) {
            soma = soma + valor2;
        }
        System.out.println(soma);
        sc.close();

        //Correção: Não ficou claro o que era solicitado no enunciado, a resposta também não ajudou na compreensão.
    }
};