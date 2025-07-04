package exercicios;

import java.util.Scanner;

public class exPro6sec4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, C;
        System.out.println("Digite o primeiro valor: ");
        A = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        B = sc.nextDouble();
        System.out.println("Digite o terceiro valor: ");
        C = sc.nextDouble();
        double areaTrianguloRetangulo = (A * C) / 2;
        double areaCirculo = Math.pow(C, 2) * Math.PI;
        double areaTrapezio = ((A + B) * C)/2;
        double areaQuadrado = Math.pow(B, 2);
        double areaRetangulo = A * B;
        System.out.printf("""
                Área do Triângulo: %.2f,
                Área do Círculo: %.2f,
                Área do Trapézio: %.2f,
                Área do Quadrado: %.2f,
                Área do Retângulo: %.2f
                """, areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);
        sc.close();
    }
}