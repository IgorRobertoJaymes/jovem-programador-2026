public class Ex9 {

	public static void main(String[] args) {

		// Declaração e inicialização do primeiro vetor
		int vetor1[] = { 2, 5, -9, 10, 8, 7, 4, -2, 7, 21 };

		// Declaração e inicialização do segundo vetor
		int vetor2[] = { -4, 1, 9, 3, 2, 5, 8, 1, 4, 10 };

		// Criação do vetor que armazenará a soma dos elementos
		// Tem o mesmo tamanho de vetor1 (e assume-se que vetor2 também tem esse tamanho)
		int vetorSoma[] = new int[vetor1.length];

		// Loop responsável por realizar a soma elemento a elemento
		for (int i = 0; i < vetorSoma.length; i++) {
			/*
			 * LÓGICA DA SOMA:
			 * Para cada posição 'i':
			 * - Acessa o elemento i de vetor1
			 * - Acessa o elemento i de vetor2
			 * - Soma os dois valores
			 * - Armazena o resultado na posição i de vetorSoma
			 *
			 * Ou seja:
			 * vetorSoma[i] = vetor1[i] + vetor2[i]
			 *
			 * Exemplo:
			 * i = 0 → 2 + (-4) = -2
			 * i = 1 → 5 + 1 = 6
			 * i = 2 → -9 + 9 = 0
			 * ...
			 *
			 * Isso caracteriza uma soma vetorial posição a posição.
			 */
			vetorSoma[i] = vetor1[i] + vetor2[i];
		}

		// Impressão do vetor 1
		System.out.print("Vetor 1: ");
		for (int i = 0; i < vetor1.length; i++) {
			System.out.print(vetor1[i] + ", ");
		}

		// Impressão do vetor 2
		System.out.print("\n\nVetor 2: ");
		for (int i = 0; i < vetor2.length; i++) {
			System.out.print(vetor2[i] + ", ");
		}

		// Impressão do vetor resultante da soma
		System.out.print("\n\nVetor soma: ");
		for (int i = 0; i < vetorSoma.length; i++) {
			System.out.print(vetorSoma[i] + ", ");
		}

	}

}