import java.util.Scanner;

public class Ex8ComSwitch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Insira o primeiro número");
		double num1 = input.nextDouble();

		System.out.println("Insira o segundo número");
		double num2 = input.nextDouble();

		System.out.println("Insira a operação");
		int operacao = input.nextInt();

		/*
		 * O switch funciona como uma forma organizada de escolher entre várias opções
		 * com base no valor de uma variável. Aqui, ele verifica o valor da variável
		 * "operacao".
		 */
		switch (operacao) {

		// Se operacao for 1, executa a soma
		case 1 -> System.out.println(num1 + num2);

		// Se operacao for 2, executa a subtração
		case 2 -> System.out.println(num1 - num2);

		// Se operacao for 3, executa a multiplicação
		case 3 -> System.out.println(num1 * num2);

		// Se operacao for 4, executa a divisão
		case 4 -> System.out.println(num1 / num2);

		// Se o valor não for nenhum dos casos acima
		default -> System.out.println("Operação inválida");
		}

	}

}
