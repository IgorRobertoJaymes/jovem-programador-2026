import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o primeiro número");
		double num1 = input.nextDouble();

		System.out.println("Insira o segundo número");
		double num2 = input.nextDouble();

		System.out.println("Insira a operação");
		int operacao = input.nextInt();

		// Valida operacao para impedir comparação caso o número inserido seja errado
		if (operacao >= 1 && operacao <= 4) {

			if (operacao == 1) {
				System.out.println(num1 + num2);
			} else if (operacao == 2) {
				System.out.println(num1 - num2);
			} else if (operacao == 3) {
				System.out.println(num1 * num2);
			} else if (operacao == 4) {
				System.out.println(num1 / num2);
			}

		}
		// Mensagem de erro
		else {
			System.out.println("Operação inválida");
		}

	}

}
