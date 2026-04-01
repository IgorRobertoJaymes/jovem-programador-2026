import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Declara e inicializa um vetor (array) de inteiros com tamanho fixo 5
		// Todos os elementos começam com valor padrão 0
		int vetor[] = new int[5];

		System.out.println("Insira o número que seja colocar no vetor");
		int numero = input.nextInt();

		System.out.println("Insira o índice do vetor que deseja inserir o número " + numero);
		int indice = input.nextInt();

		// Validação do índice:
		// Garante que o índice esteja dentro dos limites válidos do vetor
		// Índices válidos vão de 0 até vetor.length - 1 (neste caso, 0 a 4)
		while (indice < 0 || indice >= vetor.length) {
			System.out.println("Índice inválido, insira novamente");
			indice = input.nextInt();
		}

		// Atribuição no vetor:
		// Armazena o valor 'numero' na posição 'indice' do vetor
		// Exemplo: se indice = 2, então vetor[2] = numero
		vetor[indice] = numero;

		// Percorre todo o vetor para exibir seus valores
		// Mesmo posições não preenchidas explicitamente continuam com valor 0
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
