package exercicios;

import java.util.Scanner;

public class exPro4Sec5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o horário de início: ");
        int horarioInicio = sc.nextInt();
        System.out.println("Digite o horário de fim: ");
        int horarioFim = sc.nextInt();
        int duracao = horarioFim - horarioInicio;
        System.out.println(duracao);

        /* Anotação: Pessoalmente, me senti desafiada por esse exercício, sabendo que a conta ficaria super estranha considerando que estamos falando de tempo que, por não ser um inteiro normal, não conseguia imaginar como resolver essa. Uma vez que vi a correção, encontrei a saída e pedi para o DeepSeek me explicar melhor o motivo dela. Colocarei a solução abaixo, mas gostaria de, no futuro, voltar nesse exercício e fazê-lo, apenas para fazer mesmo.
        *
        * Correção:
        * import java.util.Scanner;

public class uri1046 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();

		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}

		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		sc.close();
	}
} */
    }
}