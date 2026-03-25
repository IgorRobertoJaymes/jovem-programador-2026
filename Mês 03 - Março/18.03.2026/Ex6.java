import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o ponto X");
		int x = input.nextInt();

		System.out.println("Insira o ponto Y");
		int y = input.nextInt();

		// Verifica em qual quadrante ou eixo o ponto (x, y) está localizado

		// 1º quadrante: X positivo e Y positivo
		if (x > 0 && y > 0) {
			System.out.println("1º quadrante");

			// 2º quadrante: X negativo e Y positivo
		} else if (x < 0 && y > 0) {
			System.out.println("2º quadrante");

			// 3º quadrante: X negativo e Y negativo
		} else if (x < 0 && y < 0) {
			System.out.println("3º quadrante");

			// 4º quadrante: X positivo e Y negativo
		} else if (x > 0 && y < 0) {
			System.out.println("4º quadrante");

			// Ponto está sobre o eixo X (Y = 0, mas X ≠ 0)
		} else if (x != 0 && y == 0) {
			System.out.println("Eixo X");

			// Ponto está sobre o eixo Y (X = 0, mas Y ≠ 0)
		} else if (x == 0 && y != 0) {
			System.out.println("Eixo Y");

			// Caso especial: origem (0,0)
		} else {
			System.out.println("Origem");
		}

	}

}
