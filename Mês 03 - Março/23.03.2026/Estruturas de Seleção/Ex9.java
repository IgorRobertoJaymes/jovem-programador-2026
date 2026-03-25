import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira a letra");
		char letra = input.next().charAt(0);

		// Converte a letra para minúscula para facilitar a comparação
		letra = Character.toLowerCase(letra);

		// Verifica se o caractere está no intervalo das letras minúsculas
		if (letra >= 97 && letra <= 122) {

			// Verifica se a letra é uma vogal
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				System.out.println("Vogal"); // Caso seja vogal
			} else {
				System.out.println("Consoante"); // Caso seja consoante
			}

		} else {
			// Caso o caractere não seja uma letra
			System.out.println("O caracter digitado não é uma letra");
		}

	}

}
