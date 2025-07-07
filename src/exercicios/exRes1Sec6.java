package exercicios;

import java.util.Scanner;

public class exRes1Sec6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 1;

        while (x != y) {
            System.out.println("Digite o valor de x: ");

            x = sc.nextInt();

            System.out.println("Digite o valor y: ");

            y = sc.nextInt();

            System.out.print(x + " ");
            System.out.print(y);

            if (x < y) {
                System.out.println(" Crescente");
            } else if (x > y) {
                System.out.println(" Decrescente");
            }
        }

        sc.close();
    }
}