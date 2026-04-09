import java.util.Scanner;
import java.util.Arrays;

public class Questao03 {
    public static void main(String[] args) {
        // Vetor original fornecido no enunciado
        int[] vetorOriginal = {6, 3, 1, 7, 4, 2, 3, 8, 4, 1};
        Scanner sc = new Scanner(System.in);

        System.out.println("Vetor original: " + Arrays.toString(vetorOriginal));
        
        System.out.print("Informe o índice inicial: ");
        int inicio = sc.nextInt();
        System.out.print("Informe o índice final: ");
        int fim = sc.nextInt();

        // Validação dos índices (conforme pedido no enunciado)
        if (inicio >= 0 && fim < vetorOriginal.length && inicio <= fim) {
            
            // Calcula o tamanho do novo vetor
            int tamanho = fim - inicio + 1;
            int[] novoVetor = new int[tamanho];

            // Preenche o novo vetor com os elementos do intervalo
            for (int i = 0; i < tamanho; i++) {
                novoVetor[i] = vetorOriginal[inicio + i];
            }

            System.out.println("Novo vetor extraído: " + Arrays.toString(novoVetor));
        } else {
            System.out.println("Erro: Índices inválidos!");
        }

        sc.close();
    }
}