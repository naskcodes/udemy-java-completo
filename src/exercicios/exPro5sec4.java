package exercicios;

import java.util.Scanner;

public class exPro5sec4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo1, quantidade1, codigo2, quantidade2;
        double preco1, preco2;
        System.out.println("Digite o código do produto: ");
        codigo1 = sc.nextInt();
        System.out.println("Digite a quantidade de produtos: ");
        quantidade1 = sc.nextInt();
        System.out.println("Digite o valor unitário: ");
        preco1 = sc.nextDouble();
        System.out.println("Digite o código do segundo produto: ");
        codigo2 = sc.nextInt();
        System.out.println("Digite a quantidade dos novos produtos: ");
        quantidade2 = sc.nextInt();
        System.out.println("Digite o valor unitário do novo produto: ");
        preco2 = sc.nextDouble();
        double valor1 = preco1 * quantidade1;
        double valor2 = preco2 * quantidade2;
        //Correção: Não coloquei o valor total a ser pago pelo cliente, tratei como se fosse cliente diferentes e não apenas um único cliente pegando vários itens.
        System.out.printf("Código: %d%nQuantidade: %d%nPreço: R$%.2f%nValor Total: R$%.2f%nCódigo: %d%nQuantidade: %d%nPreço: R$%.2f%nValor Total: R$%.2f", codigo1, quantidade1, preco1, valor1, codigo2, quantidade2, preco2, valor2);
        sc.close();
    }
}