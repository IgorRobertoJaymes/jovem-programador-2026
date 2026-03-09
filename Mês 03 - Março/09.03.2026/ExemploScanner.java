
// Import do Scanner (escrito pelas IDEs automaticamente)
import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {

		// Declaração e instância do Scanner
		// O nome input pode ser mudado para o nome de sua preferência
		Scanner input = new Scanner(System.in);

		System.out.println("Insira sua idade");
		// Entrada específica para o tipo da variável
		int idade = input.nextInt();

		System.out.println("A sua idade e: " + idade);

	}

}
