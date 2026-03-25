import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o gênero");
		char genero = input.next().charAt(0);

		// Modifica o char entrado para maiúsculo
		genero = Character.toUpperCase(genero);

		// Comparações feitas especificamente com caracteres maiúsculos
		if (genero == 'M' /* || genero = 'm' Caso não seja feita a normalização */) {
			System.out.println("Masculino");
		} else if (genero == 'F') {
			System.out.println("Feminino");
		} else if (genero == 'I') {
			System.out.println("Não informado");
		} else {
			System.out.println("Entrada incorreta");
		}

	}

}
