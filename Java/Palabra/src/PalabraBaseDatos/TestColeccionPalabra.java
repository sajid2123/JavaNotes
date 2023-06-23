package PalabraBaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class TestColeccionPalabra {

	
	public static void main(String[]args) throws SQLException {
		Scanner tec = new Scanner(System.in);
		int entrada,seguir;
		String ingles,frances,espanyol,dic,palabraBuscada,palabraAnt,palabraNueva;
		Connection con = null;
		
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/palabras","root","sajid");
			System.out.println("Conexion establecida con BasedeDatos");
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		
		do {
			getMenu();
			entrada=tec.nextInt();
			switch(entrada) {
			case 1:
				do {
					
					System.out.println("Ingles");
					ingles=tec.next();
					System.out.println("Frances");
					frances=tec.next();
					System.out.println("Espanyol");
					espanyol=tec.next();
					insertarPalabra(con,ingles,frances,espanyol);
					System.out.println("¿Quieres Seguir? Fin=0");
					seguir=tec.nextInt();
				}while(seguir!=0);
			
				break;
			case 2:
				do {
					System.out.println("En que idioma quieres buscar");
					dic=tec.next();
					System.out.println("Palabra que quieres buscar");
					palabraBuscada=tec.next();
					if(buscar(con,dic,palabraBuscada)==true) {
						System.out.println("Existe la palabra " + palabraBuscada);
					}else {
						System.out.println("NO existe la palabra " + palabraBuscada);
					}
					
					System.out.println("Quieres seguir 'Fin=0'");
					seguir=tec.nextInt();
				}while(seguir!=0);
				break;
			case 3:
				do {
					
					System.out.println("En que idioma quieres cambiar la palabra");
					dic=tec.next();
					System.out.println("Palabra Antigua");
					palabraAnt=tec.next();
					System.out.println("Palabra Nueva");
					palabraNueva = tec.next();
					modificarPalabra(con,dic,palabraNueva,palabraAnt);
					System.out.println("Quieres seguir 'Fin=0'");
					seguir=tec.nextInt();
				}while(seguir!=0);
				break;
			case 4:
				do {
					
					System.out.println("Palabra que quieres eliminar");
					palabraBuscada=tec.next();
					System.out.println("En que idioma es la palabra");
					dic=tec.next();

					eliminar(con,dic,palabraBuscada);
					
					System.out.println("Quieres seguir 'Fin=0'");
					seguir=tec.nextInt();
				}while(seguir!=0);
				
				break;
			case 5:
				verVocabulario(con);
				break;
			}
		}while(entrada!=0);
		
	}
	public static boolean buscar(Connection con,String idioma,String palabra) throws SQLException {
		boolean existe = false;
		Statement stmt = null;
		String query = "select " + idioma +" from vocabulario where " +idioma+" like '" + palabra+"'";
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				String m = rs.getString(idioma);
				if(palabra.equalsIgnoreCase(m)) {
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
	public static void eliminar(Connection con,String idioma,String palabra) throws SQLException {
		
		Statement stmt = null;
		String query = "delete from vocabulario where " +idioma+" like '" + palabra+"'";
		if(buscar(con,idioma,palabra)) {
			try {
				stmt = con.createStatement();
				stmt.executeUpdate(query);
				System.out.println("Eliminada la palabra " + palabra);

			}catch(SQLException e) {
				e.printStackTrace();
			} finally{
		        stmt.close();
		    }
		}else {
			System.out.println("No hemos encontrado la palabra "+ palabra +" en bases de datos");

		}
		
		
	}
	public static void insertarPalabra(Connection con,String ingles,String frances,String espanyol) throws SQLException {
		
		String insert = "insert into vocabulario VALUES" +
				"('" + ingles +"','" + frances +"','" + espanyol+ "')"; 

		Statement stmt = null;
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(insert);
		} catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
						
		
	}
public static void modificarPalabra(Connection con,String idioma,String palabraNueva,String palabraAntigua) throws SQLException {
		
		String insert = "update vocabulario set " +idioma +
				"='" + palabraNueva +"' where "  + idioma +" ='" + palabraAntigua+ "'"; 
		
		if(buscar(con,idioma,palabraAntigua)== true) {
			Statement stmt = null;
			try {
				stmt = con.createStatement();
				stmt.executeUpdate(insert);
			} catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            if (stmt != null) {
	                stmt.close();
	            }
	        }
		}else {
			System.out.println("No hemos encontrado la palabra "+ palabraAntigua+" en bases de datos");
		}
		
						
		
	}
	public static void verVocabulario(Connection con)throws SQLException {
		Statement stmt = null;
		String query = "select * from vocabulario";
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				String INGLES = rs.getString("INGLES");
				System.out.print("PALABRA [INGLES: " + INGLES);
				String FRANCES = rs.getString("FRANCES");
				System.out.print("| FRANCES: " + FRANCES + "|");
				String ESPANYOL = rs.getString("ESPANYOL");
				System.out.print("| ESPANYOL: " + ESPANYOL+ "]\n\n");
				
			
			}
		}catch(SQLException e) {
			e.printStackTrace();
		} finally{
	        stmt.close();
	    }
		
	}
	
	public static void getMenu() {
		System.out.println("1.Add");
		System.out.println("2.Buscar");
		System.out.println("3.Modificar");
		System.out.println("4.Eliminar");
		System.out.println("5.Mostrar");
		System.out.println("0.Salir");
		
	}
}
