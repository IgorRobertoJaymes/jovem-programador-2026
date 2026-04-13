import java.util.Scanner;

public class ExercicioMetodos02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do colega para ver as informações: ");
        String nomeBusca = sc.next();

        // A lógica usa o nome digitado para escolher o método
        if (nomeBusca.equalsIgnoreCase("Igor")) {
            Igor();
        } else if (nomeBusca.equalsIgnoreCase("Maria")) {
            Maria();
        } else {
            System.out.println("Colega não encontrado.");
        }

        sc.close();
    }

    // --- Métodos com os nomes dos colegas ---
    // Cada método imprime os 3 prints separados pedidos

    public static void Igor() {
        System.out.println("O nome dele(a) é Igor");
        System.out.println("Ele(a) tem 23 anos");
        System.out.println("Ele(a) é estudante de desenvolvimento de sistemas");
    }

    public static void Maria() {
        System.out.println("O nome dele(a) é Maria");
        System.out.println("Ele(a) tem 22 anos");
        System.out.println("Ele(a) é estudante de desenvolvimento de sistemas");
    }
}
