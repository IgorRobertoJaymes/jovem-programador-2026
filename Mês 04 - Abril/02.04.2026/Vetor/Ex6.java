public class Ex6 {

    public static void main(String[] args) {

        // Vetor original com valores fixos
        int vetorOriginal[] = { 2, 5, -9, 10, 8, 7 };

        // Cria um novo vetor com o mesmo tamanho do original
        int vetorInvertido[] = new int[vetorOriginal.length];

        /*
         * A lógica principal de inversão acontece neste laço.
         * 
         * Ideia:
         * - Percorremos o vetorInvertido do início (i = 0) até o fim.
         * - Para cada posição i, pegamos o elemento correspondente "espelhado"
         *   no vetorOriginal.
         * 
         * Fórmula usada:
         * vetorOriginal.length - 1 - i
         * 
         * Explicação:
         * - vetorOriginal.length - 1 → último índice do vetor original
         * - Subtraindo i, vamos andando "para trás"
         * 
         * Exemplo com vetorOriginal = [2, 5, -9, 10, 8, 7]
         * Índices:                     0  1   2   3   4  5
         * 
         * Iterações:
         * i = 0 → pega índice 5 → 7
         * i = 1 → pega índice 4 → 8
         * i = 2 → pega índice 3 → 10
         * i = 3 → pega índice 2 → -9
         * i = 4 → pega índice 1 → 5
         * i = 5 → pega índice 0 → 2
         */
        for (int i = 0; i < vetorInvertido.length; i++) {
            vetorInvertido[i] = vetorOriginal[vetorOriginal.length - 1 - i];
        }

        for (int i = 0; i < vetorInvertido.length; i++) {
            System.out.println(vetorInvertido[i]);
        }

    }

}