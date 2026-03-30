import java.util.Scanner;

public class ExemploVetor {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// =========================
		// EXEMPLO 1: Criando um vetor vazio
		// =========================

		// Criamos um vetor (array) de números decimais (double)
		// com 4 posições (índices de 0 até 3)
		double vetorAlturas[] = new double[4];

		// Atribuímos valores manualmente para cada posição
		// IMPORTANTE: vetores começam no índice 0
		vetorAlturas[0] = 1.8;
		vetorAlturas[1] = 1.6;
		vetorAlturas[2] = 1.75;
		vetorAlturas[3] = 1.9;

		// =========================
		// EXEMPLO 2: Criando e preenchendo ao mesmo tempo
		// =========================

		// Aqui criamos o vetor já com valores definidos
		// O Java automaticamente define o tamanho com base nos valores
		double vetorAltura2[] = { 1.8, 1.6, 1.75, 1.9 };

		// =========================
		// EXEMPLO 3: Vetor com tamanho definido pelo usuário
		// =========================

		// Pergunta ao usuário quantos atletas ele quer cadastrar
		System.out.println("Insira a quantidade de atletas a serem cadastrados");
		int qtdAtletas = input.nextInt();

		// Criamos um vetor com tamanho baseado na resposta do usuário
		double vetorAlturas3[] = new double[qtdAtletas];

		// =========================
		// Preenchendo o vetor com um laço (for)
		// =========================

		// O "for" percorre o vetor do início ao fim
		// i representa o índice (posição) do vetor
		for (int i = 0; i < vetorAlturas3.length; i++) {

			// (i + 1) é usado só para mostrar números começando em 1 (mais amigável)
			System.out.println("Insira a altura Nº " + (i + 1));

			// Lê o valor digitado e guarda na posição i do vetor
			vetorAlturas3[i] = input.nextDouble();
		}

		// Percorremos novamente o vetor para mostrar os valores armazenados
		for (int i = 0; i < vetorAlturas3.length; i++) {
			System.out.println(vetorAlturas3[i]);
		}

	}
}