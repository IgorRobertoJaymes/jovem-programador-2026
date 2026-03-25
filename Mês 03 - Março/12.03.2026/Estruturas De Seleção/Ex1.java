import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o primeiro número");
		int num1 = input.nextInt();

		System.out.println("Insira o segundo número");
		int num2 = input.nextInt();

		// Comparação dos números
		if (num1 > num2) { // Essa linha não finaliza com ;
			// Caso o num1 seja maior do que o num2
			System.out.println("O número " + num1 + " é maior do que o " + num2);
		} else {
			// Caso o num2 seja maior do que o num1
			System.out.println("O número " + num2 + " é maior do que o " + num1);
		}

	}
}
