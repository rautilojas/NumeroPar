package numeroPar;
import javax.swing.JOptionPane;

public class NumeroPar {
	
	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));
		
		if (num % 2 == 0) {
			JOptionPane.showMessageDialog(null, "El numero es par");
		} else {
			JOptionPane.showMessageDialog(null, "El numero es impar");
		}
		
	}

}