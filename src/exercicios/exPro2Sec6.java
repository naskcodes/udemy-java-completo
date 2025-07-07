package exercicios;

import java.util.Scanner;

public class exPro2Sec6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o eixo X: ");
        double x = sc.nextDouble();
        System.out.println("Digite o eixo Y: ");
        double y = sc.nextDouble();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro quadrante");
            } else if (x > 0 && y < 0) {
                System.out.println("Quarto quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo quadrante");
            }

            System.out.println("Digite o eixo X: ");
            x = sc.nextDouble();
            System.out.println("Digite o eixo Y: ");
            y = sc.nextDouble();
        }

        sc.close();
    }
}