
public class Ex1 {

	public static void main(String[] args) {

		int numeros[] = { 5, 2, 67, 82, 45 };

		/*
		 * Loop for para percorrer o array de trás para frente
		 * 
		 * int i = numeros.length - 1: - 'length' retorna o tamanho do array (neste
		 * caso, 5) - Como os índices começam em 0, o último índice válido é length - 1
		 * (4) - Portanto, começamos pelo último elemento
		 * 
		 * i >= 0: - Condição de parada - Continua enquanto o índice for válido (0 é o
		 * primeiro índice)
		 * 
		 * i--: - Decrementa o índice a cada iteração - Isso faz o loop andar
		 * "para trás" no array
		 */
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.print(numeros[i] + " ");
		}
	}

}
