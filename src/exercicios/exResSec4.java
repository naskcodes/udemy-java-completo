package exercicios;

import java.util.Scanner;

public class exResSec4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a altura: ");
        double altura = sc.nextDouble();
        System.out.println("Digite o comprimento: ");
        double comprimento = sc.nextDouble();
        System.out.println("Digite o valor do metro quadrado: ");
        double valorMetroQuadrado = sc.nextDouble();
        double area = comprimento * altura;
        double preco = valorMetroQuadrado * area;
        System.out.println("A área do terreno é de: " + area);
        System.out.println("O preço do terreno é de: " + preco);

        //Correção: Faltou o sc.close();
        sc.close();

        //Correção: Faltou também limitar o número de casas decimais a duas casas
    }
}
