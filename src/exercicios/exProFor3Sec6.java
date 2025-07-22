package exercicios;

import java.util.Scanner;

public class exProFor3Sec6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double primeiroValor = 0;
        double segundoValor = 0;
        double terceiroValor = 0;
        System.out.println("Digite o primeiro valor: ");
        primeiroValor = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        segundoValor = sc.nextDouble();
        System.out.println("Digite o terceiro valor: ");
        terceiroValor = sc.nextDouble();
        double media = (primeiroValor + segundoValor + terceiroValor) / 3;
        System.out.println(media);
        /* Correção:
        int n = sc.nextInt();

		for (int i=0; i<n; i++) {

			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("%.1f%n", media);
		}
         */
        sc.close();
    }
}