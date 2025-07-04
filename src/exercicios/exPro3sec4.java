package exercicios;

import java.util.Scanner;

public class exPro3sec4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D;
        System.out.println("Digite quatro números: ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        int calculo = A * B - C * D;
        System.out.printf("%d * %d - %d * %d = %d", A, B, C, D, calculo);
        sc.close();
    }
}