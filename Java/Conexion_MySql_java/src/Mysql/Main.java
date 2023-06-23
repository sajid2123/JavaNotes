package Mysql;

import java.sql.*;
import java.util.*;


public class Main {
	public static void main(String[]args) {
		 // Conexiones
        Connection conexion1 = null;
        Connection conexion2 = null;
        Connection conexion3 = null;

        // Usuario y clave
        String user = "root";
        String password = "sajid";
        
        try {
            // Una sola candena de conexión, en un solo parámetro se concatena el usuario y el password
            String url1 = "jdbc:mysql://localhost:3306/prueba?user=" + user + "&password=" + password;
            conexion1 = DriverManager.getConnection(url1);
            if (conexion1 != null) {
                System.out.println("Conexión 1: Conexión a mibase satisfactoria");
            }

            // Se envía la cadena y los datos de usuario y password por separado
            Properties datos = new Properties();
            datos.put("user", user);
            datos.put("password", password);
            String url2 = "jdbc:mysql://localhost:3306/prueba";
            conexion2 = DriverManager.getConnection(url2, datos);
            
            
            String url3 = "jdbc:mysql://localhost:3306/prueba";
            conexion3 = DriverManager.getConnection(url3,user, password);
            if(conexion3 !=null) {
            	 System.out.println("Conexión 3: Conexión a mibase satisfactoria");
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar: ");
            e.printStackTrace();
	}
	}
	
	public static void printSQLException(SQLException ex) {
		ex.printStackTrace(System.err);
		System.err.println("SqlState" +  ex.getSQLState());
		System.err.println("SqlState" +  ex.getErrorCode());
		System.err.println("SqlState" +  ex.getMessage());
		
	}
	
}
