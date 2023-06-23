package DAO;

import java.sql.*;


public class Conexion_DB {
	
	
	 public Connection AbrirConexion() throws Exception 
	    {
	        Connection con=null;  // instacia una conexión
	        try {
	           Class.forName("com.mysql.cj.jdbc.Driver");  // Cargar el driver
	           String urlOdbc = "jdbc:mysql://localhost:3306/sesionV";
	           con=(java.sql.DriverManager.getConnection(urlOdbc,"root","sajid"));  //crea conexión
	           return con;
	         } catch(Exception e){//SQLException y ClassNotFoundException
	            e.printStackTrace();
	            throw new Exception("Ha sido imposible establecer la conexion"+e.getMessage());
	         }          
	    }
	 public  void CerrarConexion(Connection con) throws Exception
	    {
	        
	        try {
	             if (con!= null) con.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	            throw new Exception("Ha sido imposible cerrar la conexion"+e.getMessage());
	        }    
	        }  
}
