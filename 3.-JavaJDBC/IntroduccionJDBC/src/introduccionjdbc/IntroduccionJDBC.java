/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccionjdbc;
import java.sql.*;


/**
 *
 * @author ALUCI
 */
public class IntroduccionJDBC {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// cadena de conexion a MySQL, el parametro use SSL es opcional
		String url ="jdbc:mysql://localhost:3306/sga?useSSL=false";
		
		//Cargar driver mysql
		try{
			Class.forName("com.mysql.jdbc.Driver");
			//Creamos el objeto de conexion
			Connection conexion = (Connection) DriverManager.getConnection(url, "root", "J3d1d1an2018");
			
			//Crear un objeto statement
			Statement instruccion = conexion.createStatement();
			
			//Creamos el query
			String sql = "select id_persona, nombre, apellido from persona";
			ResultSet result = instruccion.executeQuery(sql);
			while( result.next() ){
				System.out.print("Id: "+ result.getInt(1) );
				System.out.print(" Nombre: "+ result.getString(2) );
				System.out.println(" Apellido: "+ result.getString(3) );
			}
			//Cerrar los obketos utilizados
			result.close();
			instruccion.close();
			conexion.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
