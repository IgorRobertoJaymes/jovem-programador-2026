import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira a letra");
		char letra = input.next().charAt(0);

		letra = Character.toLowerCase(letra);

		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("Vogal");
		} else {
			System.out.println("Consoante");
		}

	}

}
