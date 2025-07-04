package exercicios;

import java.util.Scanner;

public class exRes1Sec5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2;
        System.out.println("Digite a nota do aluno no primeiro semestre: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a nota do aluno no segundo semestre: ");
        nota2 = sc.nextDouble();
        double soma = nota1 + nota2;
        System.out.printf("Nota final: %.2f%n", soma);
        if (soma >= 60.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        sc.close();
    }
}