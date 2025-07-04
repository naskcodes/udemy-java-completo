package exercicios;

import java.util.Scanner;

public class exPro5Sec5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cq, xs, xb, ts, rf, total;
        cq = 4.0;
        xs = 4.5;
        xb = 5.0;
        ts = 2.0;
        rf = 1.5;
        total = 0.0;
        System.out.println("Digite o número do seu pedido: \nOu digite 6 para sair.");
        int pedido = sc.nextInt();
        while (pedido != 6){
            switch (pedido) {
                case 1:
                    total = total + cq;
                    System.out.println("Digite o número do seu pedido: \nOu digite 6 para sair.");
                    pedido = sc.nextInt();
                    break;
                case 2:
                    total = total + xs;
                    System.out.println("Digite o número do seu pedido: \nOu digite 6 para sair.");
                    pedido = sc.nextInt();
                    break;
                case 3:
                    total = total + xb;
                    System.out.println("Digite o número do seu pedido: \nOu digite 6 para sair.");
                    pedido = sc.nextInt();
                    break;
                case 4:
                    total = total + ts;
                    System.out.println("Digite o número do seu pedido: \nOu digite 6 para sair.");
                    pedido = sc.nextInt();
                    break;
                case 5:
                    total = total + rf;
                    System.out.println("Digite o número do seu pedido: \nOu digite 6 para sair.");
                    pedido = sc.nextInt();
                    break;
            }
        }
        System.out.println("Total: R$" + total);
        sc.close();
    }
}

//Correção: Funcionou, mas eu esqueci de contar a quantidade e não usei o if e o else. E eu deixei o programa aberto até o cliente fechar, ele pegou apenas um pedido.
/*
* int codigo = sc.nextInt();
		int quantidade = sc.nextInt();

		double total;
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}

		System.out.printf("Total: R$ %.2f%n", total);
* */