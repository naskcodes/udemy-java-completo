package exercicios;

import java.util.Scanner;

public class exProFor2Sec6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma quantidade: ");
        int quantidade = sc.nextInt();
        int quantDentro = 0;
        int quantFora = 0;
        for (int i = 0; i < quantidade; i++){
            System.out.println("Digite um valor: ");
            int valor = sc.nextInt();
            if (valor >= 10 && valor <= 20) {
                quantDentro = quantDentro + 1;
            } else {
                quantFora = quantFora + 1;
            }
        }
        System.out.printf("%d in%n%d out", quantDentro, quantFora);
        sc.close();
    }
}