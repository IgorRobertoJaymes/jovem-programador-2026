
public class Ex2 {

	public static void main(String[] args) {

		// Variáveis para armazenar as somas
		int somaPar = 0;
		int somaImpar = 0;

		// i começa em 1, vai até 100, incrementando de 1 em 1
		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) {
				somaPar += i; // Soma o número par na variável somaPar
			} else {
				somaImpar += i; // Soma o número ímpar na variável somaImpar
			}

		}

		System.out.println("Soma dos pares: " + somaPar);
		System.out.println("Soma dos impares: " + somaImpar);
	}

}
