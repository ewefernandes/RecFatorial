package view;
import controller.Modulos;
import javax.swing.JOptionPane;

public class Principal {
	public static void main (String [] args) {
		Modulos m = new Modulos();
		int a=13, b=1;
		
		while (a > 12) {
			a = Integer.parseInt(JOptionPane.showInputDialog("Insira número de 1 a 12:"));
		}
		int fatorial = m.funcFatorial(a, b);
		System.out.println("Fatorial = " +fatorial);
	}
	
}
