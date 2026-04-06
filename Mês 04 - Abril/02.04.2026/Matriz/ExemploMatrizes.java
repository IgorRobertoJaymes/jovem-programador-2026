public class ExemploMatrizes {

	public static void main(String[] args) {

		// Declaração e alocação de uma matriz 2D (4 linhas x 5 colunas)
		int matriz[][] = new int[4][5];

		// Variável auxiliar para preencher a matriz com valores sequenciais
		int contador = 1;

		// Percorre as linhas da matriz
		for (int i = 0; i < matriz.length; i++) {

			// Para cada linha, percorre as colunas
			// matriz[i].length representa o número de colunas da linha i
			for (int j = 0; j < matriz[i].length; j++) {

				// Atribui o valor do contador à posição [i][j]
				matriz[i][j] = contador;

				// Incrementa o contador para o próximo elemento
				contador++;
			}
		}

		// Percorre novamente a matriz para exibir os valores
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				// Imprime o elemento atual seguido de espaço
				System.out.print(matriz[i][j] + " ");
			}

			// Quebra de linha ao final de cada linha da matriz
			System.out.println();
		}

	}

}