import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o tamanho da matriz");
		int tamanho = input.nextInt();

		// a
		char a[][] = new char[tamanho][tamanho];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = '*';
			}
		}

		System.out.println("A");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		// b

		char b[][] = new char[tamanho][tamanho];

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				if (i == 0 || i == b.length - 1 || j == 0 || j == b[i].length - 1) {
					b[i][j] = '*';
				}
			}
		}

		System.out.println("\n\nB");

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		// c
		char c[][] = new char[tamanho][tamanho];

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < i + 1; j++) {
				c[i][j] = '*';
			}
		}

		System.out.println("\n\nC");

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}

}
