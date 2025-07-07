package exercicios;

import java.util.Scanner;

public class exPro3Sec6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Digite o código do combustível de preferência:
                1. Álcool
                2. Gasolina
                3. Diesel
                4. Fim
                """);

        int codigo = sc.nextInt();
        int quantidade = 0;
        int quantidadeAlcool = 0;
        int quantidadeGasolina = 0;
        int quantidadeDiesel = 0;

        while (codigo != 4) {
            if (codigo == 1) {
                quantidadeAlcool = quantidadeAlcool + 1;
            } else if (codigo == 2){
                quantidadeGasolina = quantidadeGasolina + 1;
            } else if (codigo == 3) {
                quantidadeDiesel = quantidadeDiesel + 1;
            }

            quantidade = quantidade + 1;

            System.out.println("Digite um novo código ou saia usando o número 4: ");

            codigo = sc.nextInt();

            if (codigo < 1 || codigo > 4) {
                System.out.println("Por favor, digite um valor válido");

                codigo = sc.nextInt();
            }
        }
        System.out.println("Quantidade de entrevistados: " + quantidade);
        System.out.println("Álcool: " + quantidadeAlcool);
        System.out.println("Gasolina: " + quantidadeGasolina);
        System.out.println("Diesel: " + quantidadeDiesel);
        System.out.println("Muito obrigado!");

        sc.close();
    }
}