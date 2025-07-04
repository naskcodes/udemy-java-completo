package exercicios;

import java.util.Scanner;

public class exPro8Sec5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do salário: ");
        double salario = sc.nextDouble();
        double imposto;
        if (salario <= 2000) {
            System.out.println("Isento");
        } else if (salario > 2000 && salario <= 3000) {
            imposto = salario *  8 / 100;
            System.out.println(imposto);
        } else if (salario > 3000 && salario <= 4500) {
            imposto = salario *  18 / 100;
            System.out.println(imposto);
        } else if (salario > 4500) {
            imposto = salario *  28 / 100;
            System.out.println(imposto);
        }
        sc.close();
        //Correção: a lógica está certa, mas o professor inventou um cálculo doido adicional que nem faz sentido com a tabela que ele apresentou.
    }
}