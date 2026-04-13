import java.util.Scanner;

public class ExercicioMetodos01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escolha uma estação (1-Verão, 2-Outono, 3-Inverno, 4-Primavera): ");
        int numero = sc.nextInt();

        // Lógica para chamar os métodos
        if (numero == 1) {
            exibirVerao();
        } else if (numero == 2) {
            exibirOutono();
        } else if (numero == 3) {
            exibirInverno();
        } else if (numero == 4) {
            exibirPrimavera();
        } else {
            System.out.println("Número inválido!");
        }

        sc.close();
    }

    // --- Seus Métodos ficam aqui embaixo, fora do main ---

    public static void exibirVerao() {
        System.out.println("É verão");
        System.out.println("E o tempo está quente");
    }

    public static void exibirOutono() {
        System.out.println("É outono");
        System.out.println("E as folhas estão caindo");
    }

    public static void exibirInverno() {
        System.out.println("É inverno");
        System.out.println("E está frio");
    }

    public static void exibirPrimavera() {
        System.out.println("É primavera");
        System.out.println("E as flores estão crescendo");
    }
}