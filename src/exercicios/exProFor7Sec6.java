package exercicios;

import java.util.Scanner;

public class exProFor7Sec6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        for (int i = 1; i < valor; i++){
            System.out.println(valor);
            System.out.println(Math.pow(valor, 2));
            System.out.println(Math.pow(valor, 3));
            /*Correção:
            int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
             */
        }
        sc.close();
    }
}