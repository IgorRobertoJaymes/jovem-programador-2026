import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Estrutura de repetição "for"
		// int i = 0 -> inicializa o contador
		// i < 5 -> condição para continuar o loop (vai repetir 5 vezes: 0 até 4)
		// i++ -> incrementa o contador a cada repetição
		for (int i = 0; i < 5; i++) {

			System.out.println("Insira o número");
			int numero = input.nextInt();

			if (numero % 2 == 0) {
				System.out.println("Par");
			} else {
				System.out.println("Ímpar");
			}
		}

		System.out.println("Programa finalizado");

	}

}