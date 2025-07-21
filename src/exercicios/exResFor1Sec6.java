package exercicios;

import java.util.Scanner;

public class exResFor1Sec6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número do qual deseja a tabuada: ");
        int valor = sc.nextInt();
        int multiplicado;
        for (int i = 1; i < 11; i++) {
            multiplicado = i * valor;
            System.out.printf("%d x %d = %d%n", i, valor, multiplicado);
        }
        sc.close();
    }
};