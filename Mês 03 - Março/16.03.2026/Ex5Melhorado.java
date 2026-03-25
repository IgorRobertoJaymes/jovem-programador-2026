import java.util.Scanner;

public class Ex5Melhorado {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Insira a idade");
		int idade = input.nextInt();

		// Primeiro verifica a condição mais alta.
		// Se a idade for 21 ou mais, entra aqui e o restante da cadeia de else if não é
		// executado.
		if (idade >= 21) {
			System.out.println("Adulto");

			// Só chega aqui se a condição anterior (>=21) for falsa.
			// Portanto, sabemos automaticamente que idade < 21.
			// Basta verificar se é >=18, o que na prática significa: 18 <= idade < 21
		} else if (idade >= 18) {
			System.out.println("Juvenil");

			// Este bloco só é testado se idade < 18 (porque os anteriores falharam).
			// Então ao testar >=14, o intervalo efetivo vira: 14 <= idade < 18.
		} else if (idade >= 14) {
			System.out.println("Infanto-juvenil");

			// Aqui já sabemos que idade < 14.
			// Logo, ao testar >=11, o intervalo fica: 11 <= idade < 14.
		} else if (idade >= 11) {
			System.out.println("Infantil");

			// Só chega aqui se idade < 11.
			// Então >=8 significa: 8 <= idade < 11.
		} else if (idade >= 8) {
			System.out.println("Mirim");

			// Aqui já sabemos que idade < 8.
			// Portanto >=5 resulta em: 5 <= idade < 8.
		} else if (idade >= 5) {
			System.out.println("Pré mirim");

			// Se chegou aqui, nenhuma condição anterior foi verdadeira.
			// Logo, idade < 5.
		} else {
			System.out.println("Idade inválida");
		}
	}

}