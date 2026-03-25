import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o seu peso (em kg)");
		double massa = input.nextDouble();

		System.out.println("Insira sua altura (em metros)");
		double altura = input.nextDouble();

		double imc = massa / Math.pow(altura, 2);

		if (imc >= 40) {
			System.out.println("Obesidade grau III (Mórbida)");
		} else if (imc >= 35) {
			System.out.println("Obesidade grau II (Severa)");
		} else if (imc >= 30) {
			System.out.println("Obesidade grau I");
		} else if (imc >= 25) {
			System.out.println("Sobrepeso");
		} else if (imc >= 18.5) {
			System.out.println("Saudável");
		} else {
			System.out.println("Magreza");
		}

	}

}
