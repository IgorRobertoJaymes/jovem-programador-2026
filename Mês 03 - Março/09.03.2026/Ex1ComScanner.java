
// Import do Scanner (escrito pelas IDEs automaticamente)
import java.util.Scanner;

public class Ex1ComScanner {

	public static void main(String[] args) {

		// Declaração e instância do Scanner
		// O nome input pode ser mudado para o nome de sua preferência
		Scanner input = new Scanner(System.in);

		System.out.println("Insira a primeira idade");

		int idade1 = input.nextInt();

		System.out.println("Insira a segunda idade");

		int idade2 = input.nextInt();

		int somaIdades = idade1 + idade2;

		System.out.println("A soma das idades é de: " + somaIdades);

	}

}
