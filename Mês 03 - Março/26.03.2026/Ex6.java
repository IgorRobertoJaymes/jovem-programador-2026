import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double somaAltura = 0;
		int qtdPessoas = 0;

		System.out.println("Insira a altura");
		double altura = input.nextDouble();

		// O while vai repetir ENQUANTO a condição for verdadeira
		// Aqui: enquanto a altura for diferente de 0
		// Ou seja, o usuário digita 0 para parar o programa.
		while (altura != 0) {
			qtdPessoas++;
			somaAltura += altura;

			System.out.println("Insira a altura");
			altura = input.nextDouble();
		}

		if (qtdPessoas != 0) {
			double media = somaAltura / qtdPessoas;
			System.out.println("Média das alturas: " + media);
		} else {
			System.out.println("Nenhuma altura inserida");
		}
	}

}
