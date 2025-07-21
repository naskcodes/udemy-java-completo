package exercicios;

import java.util.Scanner;

public class exProFor1Sec6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();
        for (int i = 0; i <= valor; i++) {
            if (!(i % 2 == 0)) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}