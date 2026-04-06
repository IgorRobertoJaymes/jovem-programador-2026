public class Ex3 {
	
	public static void main(String[] args) {

		// Primeira matriz 5x5 (5 linhas e 5 colunas)
        int[][] matriz1 = {
            {5, -2, 13, 7, 0},
            {8, 21, -9, 4, 11},
            {3, 6, 15, -1, 2},
            {14, 0, 9, 18, -5},
            {7, 12, -3, 10, 16}
        };

        // Segunda matriz 5x5
        int[][] matriz2 = {
            {20, 1, -4, 8, 13},
            {6, 17, 0, -2, 9},
            {11, -7, 5, 14, 3},
            {2, 19, -6, 10, 15},
            {4, 8, 12, -1, 7}
        };
        
        // Criação da matriz resultado (soma)
        // matriz1.length -> número de linhas
        // matriz1[0].length -> número de colunas da primeira linha
        // Isso evita "hardcode" (valores fixos como 5x5)
        int matrizSoma[][] = new int[matriz1.length][matriz1[0].length];
        
        // Percorre as linhas
        for(int i = 0; i < matrizSoma.length; i++) {
        	
        	// Para cada linha, percorre as colunas
        	// matrizSoma[i].length pega o tamanho da linha atual
        	// (importante pois em Java matrizes podem ser irregulares)
        	for(int j = 0; j < matrizSoma[i].length; j++) {
        		
        		// Soma elemento a elemento (mesma posição)
        		// [i][j] representa linha i e coluna j
        		matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
        	}
        }
        
        for(int i = 0; i < matrizSoma.length; i++) {
        	for(int j = 0; j < matrizSoma[i].length; j++) {
        		System.out.print(matrizSoma[i][j] + " ");
        	}
           		System.out.println();
        }
	}
}