package exercicios;

import java.util.Scanner;

public class exPro1Sec6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = "2002";
        String senhaInserida = sc.nextLine();

        while (!senha.equals(senhaInserida)) {
            System.out.println("Senha inválida");
            senhaInserida = sc.nextLine();
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}