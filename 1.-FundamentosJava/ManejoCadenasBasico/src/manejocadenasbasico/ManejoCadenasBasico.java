/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenasbasico;

/**
 *
 * @author ALUCI
 */
public class ManejoCadenasBasico {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		String nombre = "Karla";
		String apellido = "Esparza";
		System.out.println("Concatenacion:" + nombre + apellido);
		System.out.println("Nueva linea: \n" + nombre + " " + apellido);
		System.out.println("Tabulador: \t" + nombre + " " + apellido);
		System.out.println("Retroceso:\b" + nombre + " " + apellido);
		System.out.println("Retorno de carro:"+ "\r" + nombre + " " + apellido); //No funciona del todo
		System.out.println("Comilla simple: \'" + nombre + " " + apellido + "\'");
		System.out.println("Comilla doble: \"" + nombre + " " + apellido + "\"");
	}
	
}
