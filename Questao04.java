import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        double[][] temps = {
            {21.7, 21.5, 21.3, 21.2, 21.4, 21.9, 22.5, 23.0, 23.6, 24.1, 24.5, 24.8, 25.0, 24.9, 24.7, 24.5, 24.2, 24.0, 23.7, 23.4, 23.0, 22.7, 22.4, 22.1},
            {21.8, 21.6, 21.5, 21.7, 22.1, 22.8, 23.5, 24.3, 25.0, 26.0, 27.0, 28.0, 29.0, 29.5, 29.2, 28.8, 28.0, 27.0, 26.0, 25.2, 24.5, 24.0, 23.5, 22.8},
            {20.7, 20.5, 20.3, 20.2, 20.5, 21.0, 21.8, 22.5, 23.2, 24.0, 24.8, 25.5, 26.0, 26.5, 27.0, 27.5, 28.0, 28.2, 28.0, 27.8, 27.5, 27.0, 26.5, 26.0},
            {20.2, 20.0, 19.8, 19.7, 20.0, 20.5, 21.2, 22.0, 22.8, 23.5, 24.2, 25.0, 25.8, 26.5, 27.0, 27.5, 27.8, 28.0, 27.8, 27.5, 27.0, 26.5, 26.0, 25.5},
            {19.8, 19.6, 19.5, 19.4, 19.7, 20.2, 20.8, 21.5, 22.2, 23.0, 23.8, 24.5, 25.2, 26.0, 26.5, 27.0, 27.3, 27.5, 27.2, 26.8, 26.3, 25.8, 25.2, 24.5},
            {19.5, 19.3, 19.2, 19.4, 20.0, 21.0, 22.5, 24.0, 25.5, 27.0, 28.2, 29.0, 29.5, 29.8, 29.5, 29.0, 28.5, 28.0, 27.5, 27.0, 26.5, 26.0, 25.5, 25.0},
            {19.2, 19.0, 18.8, 18.7, 19.0, 19.5, 20.2, 21.0, 21.8, 22.5, 23.2, 24.0, 24.8, 25.5, 26.0, 26.5, 27.0, 27.2, 27.0, 26.7, 26.3, 25.8, 25.2, 24.5}
        };

        Scanner sc = new Scanner(System.in);
        String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};

        // a) Média de um dia específico
        System.out.print("Digite o dia (ex: Segunda): ");
        String diaEntrada = sc.next();
        int diaIdx = -1;
        for(int i=0; i<dias.length; i++) if(dias[i].equalsIgnoreCase(diaEntrada)) diaIdx = i;

        double somaDia = 0;
        for(double t : temps[diaIdx]) somaDia += t;
        System.out.printf("Média de %s: %.2f\n", diaEntrada, (somaDia/24));

        // b) Média de uma hora específica
        System.out.print("Digite a hora (0-23): ");
        int hora = sc.nextInt();
        double somaHora = 0;
        for(int i=0; i<7; i++) somaHora += temps[i][hora];
        System.out.printf("Média da hora %d: %.2f\n", hora, (somaHora/7));

        sc.close();
    }
}