
import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Lado1: ");
		double l1 = sc.nextDouble();
		System.out.print("lado 2: ");
		double l2 = sc.nextDouble();
		System.out.print("lado3: ");
		double l3 = sc.nextDouble();  
		
		if (l1 == l2 && l2 == l3) {
			System.out.println("Equilatero");
		} else if (l1 == l2 || l1 == l3 || l2 == l3) {
			System.out.println("Isósceles");
		} else {			
			System.out.println("Escaleno");
		}
		sc.close();
	}
}