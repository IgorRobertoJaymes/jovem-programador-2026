import java.util.Scanner;

public class Ex2ComScanner {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira a altura do retângulo");

		double altura = input.nextDouble();

		System.out.println("Insira a largura do retângulo");

		double largura = input.nextDouble();

		double perimetro = (altura + largura) * 2;

		double area = altura * largura;

		System.out.println("O perímetro do retângulo é de: " + perimetro + "m");

		System.out.println("A área do retângulo é de: " + area + "m²");

	}

}
