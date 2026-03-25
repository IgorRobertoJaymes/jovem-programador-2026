import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o número para ser calculado o fatorial");

		int numero = input.nextInt();

		// Verifica se o número é diferente de 0
		// (pois 0! = 1 por definição)
		if (numero != 0) {

			// Loop para calcular o fatorial
			// Começa de numero - 1 até 2
			for (int i = numero - 1; i > 1; i--) {

				// Multiplica o valor atual de numero por i
				// Exemplo: 5! = 5 * 4 * 3 * 2
				numero *= i; // numero = numero * i;
			}

		} else {
			// Caso especial: fatorial de 0 é 1
			numero = 1;
		}

		// Exibe o resultado do cálculo do fatorial
		System.out.println(numero);

	}

}
