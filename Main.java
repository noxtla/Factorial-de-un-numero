package Ciclos;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	int numero,a=0,b=1,resultado=0;
	
	
	numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero "));
	for (int i =1; i<numero; i++) {
		
		resultado = a + b;
		JOptionPane.showMessageDialog(null, "El factorial es " + resultado); 
		a = b;
		b = resultado;
	 }
	
	}
}
