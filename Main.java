package Condicionales;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	int numero,resultado=1;
	
	
	numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero "));
	for (int i =1; i<=numero; i++) {
		
		resultado *=i; 
	 }
	JOptionPane.showMessageDialog(null, resultado);
	}
}

