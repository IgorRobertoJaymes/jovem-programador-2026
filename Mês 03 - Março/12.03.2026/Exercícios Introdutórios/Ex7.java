import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o valor A");
		double a = input.nextDouble();

		System.out.println("Insira o valor B");
		double b = input.nextDouble();

		System.out.println("Insira o valor C");
		double c = input.nextDouble();

		// a) Área do triângulo retângulo que tem base A e altura C

		double areaTriangulo = (a * c) / 2;
		System.out.println("Área do triângulo é: " + areaTriangulo + "m²");

		// b) Área do círculo de raio C

		double areaCirculo = Math.PI * Math.pow(c, 2);
		System.out.println("Área do círculo é: " + areaCirculo);

		// c) Área do trapézio que tem A e B por bases e C por altura

		double areaTrapezio = ((a + b) * c) / 2;
		System.out.println("Área do trapézio: " + areaTrapezio);

		// d) Área do quadrado que tem lado B

		double areaQuadrado = Math.pow(b, 2);
		System.out.println("Área do quadrado: " + areaQuadrado);

		// e) Área do retângulo que tem lados A e B

		double areaRetangulo = a * b;
		System.out.println("Área do retângulo: " + areaRetangulo);

	}

}
