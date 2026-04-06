
public class Ex2 {

	public static void main(String[] args) {

		/* int matriz[][] = {
			{ 4, 12 },
			{ 2, -3 }
			}; */
		
		int matriz[][] = new int[2][2];
		matriz[0][0] = 4;
		matriz[0][1] = 12;
		matriz[1][0] = 2;
		matriz[1][1] = -3;
		
		int produtoDiagonalPrincipal = matriz[0][0] * matriz[1][1];
		
		int produtoDiagonalSecundaria = matriz[0][1] * matriz[1][0];
		
		int determinante = produtoDiagonalPrincipal - produtoDiagonalSecundaria;
		
		System.out.println(determinante);
		
		
		
	}

}
