package numeroPar;
import java.util.Scanner;

public class NumeroPar {
	
	public static void main(String[] args) {
		
		int num;
		Scanner numero = new Scanner(System.in);	
		System.out.println("Ingrese un numero entero:");
		num = numero.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}
		
	}

}