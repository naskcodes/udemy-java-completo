package exercicios;

import java.util.Scanner;

public class exRes2Sec6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma idade: ");

        int idade = sc.nextInt();
        int quantidade = 0;
        int total = 0;

        //Correção: while (idade >= 0) {
        while (idade > 0) {
            System.out.println("Digite uma idade: ");
            total = idade + total;
            quantidade = quantidade + 1;
            double media = total / quantidade;
            idade = sc.nextInt();
            System.out.println(total);
            System.out.println(quantidade);
            System.out.println(media);
        }

        if (idade < 0) {
            System.out.println("Impossível calcular");
        }

        /* Correção:
        if (quantidade > 0) {
            double media = (double) soma / cont;
            System.out.println("%.2f%n", media);
        } else {
            System.out.println("Impossível calcular");
        }
         */

        sc.close();
    }
}