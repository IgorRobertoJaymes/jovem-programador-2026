import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Nome do vendedor: ");
            String nome = sc.next();
            
            System.out.print("Valor total de vendas: R$ ");
            double vendas = sc.nextDouble();

            // Cálculo da comissão de 17%
            double comissao = vendas * 0.17;

            System.out.println("\n--- Relatório de Vendas ---");
            System.out.println("Vendedor: " + nome);
            System.out.printf("Total Vendido: R$ %.2f\n", vendas);
            System.out.printf("Comissão (Salário): R$ %.2f\n", comissao);
            System.out.println("---------------------------\n");

            System.out.print("Deseja digitar os dados de mais um vendedor? (s/n): ");
            continuar = sc.next().charAt(0);

        } while (continuar == 's');

        System.out.println("Programa encerrado.");
        sc.close();
	}

}
