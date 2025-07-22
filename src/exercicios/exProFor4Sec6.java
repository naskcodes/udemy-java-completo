package exercicios;

import java.util.Scanner;

public class exProFor4Sec6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de números");
        int quantidade = sc.nextInt();
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o primeiro valor: ");
            double valor1 = sc.nextInt();
            System.out.println("Digite o segundo valor: ");
            double valor2 = sc.nextInt();
//            if (quantidade % 2 == 0) {
//
//            }
            /*Correção

			int x = sc.nextInt();
			int y = sc.nextInt();

			if (y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}
             */
        }
        sc.close();
    }
}