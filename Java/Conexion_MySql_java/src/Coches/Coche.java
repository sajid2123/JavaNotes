package Coches;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Coche {
	
	
	public static void main(String[]args) throws SQLException {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coche","root","sajid");
			System.out.println("Conexion establecida con BasedeDatos");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		createTableCoche(con);
		cargarCoche(con);

	}
	 public static void createTableCoche(Connection con) throws SQLException {
	        Statement stmt = null;
	        try {
	            stmt = con.createStatement();
	    
	            // Comprobamos si la tabla ya existe
	            ResultSet rs = con.getMetaData().getTables(null, null, "Coche", null);
	            if (rs.next()) {
	                System.out.println("La tabla ya existe.");
	            } else {
	                // Si la tabla no existe, la creamos
	                String createString = "CREATE TABLE COCHE"
	                        + "(MATRICULA VARCHAR(10) PRIMARY KEY,"
	                        + "MARCA VARCHAR(40) NOT NULL,"
	                        + "MODELO VARCHAR(40) NOT NULL,"
	                        + "COLOR VARCHAR(20) NOT NULL,"
	                        + "ANYO INT(4) NOT NULL,"
	                        + "PRECIO INT(10) NOT NULL)";
	                      
	                stmt.executeUpdate(createString);
	                System.out.println("Tabla creada satisfactoriamente.");
	            }
	    
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            if (stmt != null) {
	                stmt.close();
	            }
	        }
	    }
	 public static void cargarCoche(Connection con) throws SQLException {
			
			
			Statement stmt = null;
			try {
				stmt = con.createStatement();
				if(existeCoche(con,"8012-CLY")== false) {
					String insert1 = "insert into Coche  VALUES"
							+ "('8012-CLY','RENAULT','MEGANE','NEGRO',2003,2350)";
					stmt.executeUpdate(insert1);
					System.out.println("Datos introducidos correctamente");
				}else {
					System.out.println("Ya existe esa Matricula");
				}
					
				if(existeCoche(con,"5068-GDB")== false) {
					String insert1 = "insert into Coche  VALUES"
							+ "('5068-GDB','VOLKSWAGEN','PASSAT','GZUS',2008,13500)";
					stmt.executeUpdate(insert1);
					System.out.println("Datos introducidos correctamente");
				}else {
					System.out.println("Ya existe esa Matricula");
				}
				if(existeCoche(con,"3268-BTN")== false) {
					String insert1 = "insert into Coche  VALUES"
							+ "('3268-BTN','OPEL','ASTRA','NEGRO',2002,2000)";
					stmt.executeUpdate(insert1);
					System.out.println("Datos introducidos correctamente");
				} else {
					System.out.println("Ya existe esa Matricula");
				}
			} catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            if (stmt != null) {
	                stmt.close();
	            }
	        }
	 }
	 public static boolean existeCoche(Connection con,String matricula) throws SQLException {
		boolean existe = false;
		Statement stmt = null;
		String query = "select MATRICULA from COCHE";
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				String m = rs.getString("MATRICULA");
				if(matricula.equalsIgnoreCase(m)) {
					existe = true;
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		} finally{
	        stmt.close();
	    }
		return existe;
	 }

}
