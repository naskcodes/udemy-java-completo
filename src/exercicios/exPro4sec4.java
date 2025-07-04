package exercicios;

import java.util.Scanner;

public class exPro4sec4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero, horas, valor;
        System.out.println("Digite o seu número: ");
        numero = sc.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horas = sc.nextDouble();
        System.out.println("Digite o valor ganho por hora: ");
        valor = sc.nextDouble();
        double salario = horas * valor;
        System.out.printf("Número = %.2f%nSalário = R$%.2f", numero, salario);
        sc.close();
    }
}