package exercicios;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class exRes3Sec5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int valor1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int valor2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        int valor3 = sc.nextInt();
        int[] arrayValor = {valor1, valor2, valor3};
        Arrays.sort(arrayValor);
        System.out.println("Menor número: " + arrayValor[0]);
    }
}

/*
Correção:

        if (ab && a < c) {
        }
        System.out.println("MENOR
else if (b < c) {
            Н
                    =
                    +a);
            System.out.println("MENOR
                    "1
                            =
                            +b);
        } else {
            System.out.println("MENOR + c);
                    "1
                            =
        }
        sc.close();

*/