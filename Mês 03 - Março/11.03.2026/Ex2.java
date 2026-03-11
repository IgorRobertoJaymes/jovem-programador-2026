import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o valor do raio");
		double raio = input.nextDouble();

		// Utiliza a constante matemática PI e a função de potência do Java
		double area = Math.PI * Math.pow(raio, 2);

		System.out.println("O valor da área é: " + area + "m²");

	}

}
