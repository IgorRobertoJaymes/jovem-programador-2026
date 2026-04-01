import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		// Declaração e inicialização de um vetor (array) de inteiros
		// Os índices vão de 0 a 4
		int vetor[] = { 2, 5, -9, 10, 8 };

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o número");
		int numero = input.nextInt();

		// Variável para armazenar o índice onde o número será encontrado
		// Inicializada com -1 para indicar "não encontrado"
		int indice = -1;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero) {
				// Se encontrar o número, guarda a posição (índice)
				indice = i;

				// Interrompe o loop imediatamente (evita iterações desnecessárias)
				break;
			}
		}

		// Verifica se o número foi encontrado
		if (indice == -1) {
			System.out.println("O valor não está no vetor");
		} else {
			System.out.println("O valor está no índice " + indice);
		}

	}

}
