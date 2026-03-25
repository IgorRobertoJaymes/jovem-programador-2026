import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o nome");
		// Recebe um texto inteiro, incluindo espaços
		String nome = input.nextLine();

		// Compara sem diferenciar maiúculos e minúsculos
		if (nome.equalsIgnoreCase("Henrique Delegrego")) {
			System.out.println("Nome correto");
		} else {
			System.out.println("Nome incorreto");
		}

	}

}
