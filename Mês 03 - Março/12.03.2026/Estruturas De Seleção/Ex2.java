import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o número 1");
		int num1 = input.nextInt();

		System.out.println("Insira o número 2");
		int num2 = input.nextInt();

		// Comparação para saber se o número é divisível
		if (num1 % num2 == 0) {
			System.out.println(num1 + " é divisível por " + num2);
		} else {
			System.out.println(num1 + " não é divisível por " + num2);
		}

	}

}
