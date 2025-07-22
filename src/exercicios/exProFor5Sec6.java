package exercicios;

import java.util.Scanner;

public class exProFor5Sec6 {
    public static void main(String[] args) {
//        long f = 5;
//        for (long n = 1; n < 41; n++) {
//            f = f * n;
//            System.out.println("O fatorial de " + n + " é " + f);
//        }
        Scanner sc = new Scanner(System.in);
        int fatorial = sc.nextInt();
        for (int i = 1; i > fatorial; i--) {
            fatorial = fatorial * i;
            System.out.println(fatorial);
            /* Correção:
            for (int i=1; i<=n; i++) {
                fat = fat * i;
            }
             */
        }
        sc.close();
    }
}