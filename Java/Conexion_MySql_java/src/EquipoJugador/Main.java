package EquipoJugador;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Properties;


public class Main {

	public static void main(String[] args) throws SQLException {
		
		Connection conexion = null;

        String user = "root";
        String password = "sajid";
        String nombreBaseDeDatos = "equipo_jugadores";

        try {

            // Una sola candena de conexión, en un solo parámetro se concatena el usuario y el password
            String url1 = "jdbc:mysql://localhost:3306/" + nombreBaseDeDatos + "?user=" + user + "&password=" + password;
            conexion = DriverManager.getConnection(url1);
            if (conexion != null) {
                System.out.println("Conexión 1: Conexión a " + nombreBaseDeDatos + " satisfactoria");
            }
            // Se envía la cadena y los datos de usuario y password por separado
            Properties datos = new Properties();
            datos.put("user", user);
            datos.put("password", password);
            
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        //createTableEquipo(conexion);
        //createTableJugadores(conexion);
        //cargarEquipo(conexion);
        //cargaJugador(conexion);
        //verEquipo(conexion);
        //modificacionEquipo(conexion);
        //modificaEdadJugador(conexion,1);
        //insertaJugador(conexion,33,1,"Sajid",2,19);
        //getJugadores(conexion);
        getJugadoresProc(conexion);
    }
    public static void createTableEquipo(Connection con) throws SQLException {
        Statement stmt = null;
        try {
            stmt = con.createStatement();
    
            // Comprobamos si la tabla ya existe
            ResultSet rs = con.getMetaData().getTables(null, null, "Equipo", null);
            if (rs.next()) {
                System.out.println("La tabla ya existe.");
            } else {
                // Si la tabla no existe, la creamos
                String createString = "CREATE TABLE Equipo"
                        + "(team_id INT(4) PRIMARY KEY,"
                        + "eq_nombre VARCHAR(40) NOT NULL,"
                        + "estadio VARCHAR(40) NOT NULL,"
                        + "poblacion VARCHAR(20) NOT NULL,"
                        + "provincia VARCHAR(20) NOT NULL,"
                        + "cod_postal CHAR(5) NOT NULL)";
                      
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
	public static void createTableJugadores(Connection con) throws SQLException{
		
		
		
		Statement stmt = null;
        try {
            stmt = con.createStatement();
    
            // Comprobamos si la tabla ya existe
            ResultSet rs = con.getMetaData().getTables(null, null, "Jugador", null);
            if (rs.next()) {
                System.out.println("La tabla ya existe.");
            } else {
                // Si la tabla no existe, la creamos
            	String createString = "create table Jugador (player_id INT(4) primary key," +
        				"nombre VARCHAR(40) NOT NULL," + 
        				"dorsal INT(4) NOT NULL,"+
        				"edad INT(4) NOT NULL," +
        				"team_id INT(4) NOT NULL REFERENCES Equipo(team_id))";
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
	public static void cargarEquipo(Connection con) throws SQLException {
		
		String insert = "insert into Equipo (team_id,eq_nombre,estadio,poblacion,provincia,cod_postal) VALUES" +
				"(1,'Esteponia','MONTERROSO','ESTEPONIA','MALAGA','29680')," 
				+ "(2,'ALCORCON','SANTO DOMINGO','ALCORCON','MADRID','28924')," 
				+"(3,'PORCUNA','SAN CRISTOBAL','PORCUNA','JAEN',23790)";
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
	public static void cargaJugador(Connection con) throws SQLException{
        Statement stmt = null;
try{
stmt = con.createStatement();
String insert = "INSERT INTO Jugador (player_id, nombre, dorsal, edad , team_id) VALUES "+
"(1, 'JOSE ANTONIO', 1, 42,1),"+
"(2, 'IGNACIO', 2, 62,1),"+
"(3, 'DIEGO', 3, 20,1)";
stmt.executeUpdate(insert);
insert = "INSERT INTO Jugador (player_id, nombre, dorsal, edad, team_id) VALUES "+
"(4, 'TURRION', 1, 37,2),"+
"(5, 'LUIS ABEL', 2, 37,2),"+
"(6, 'ISAAC', 3, 40,2)";
stmt.executeUpdate(insert);
insert = "INSERT INTO Jugador (player_id, nombre, dorsal, edad, team_id) VALUES "+
"(7, 'JUAN FRANCISCO', 1, 33,3),"+
"(8, 'PARRA', 2, 37,3),"+
"(9, 'RAUL', 3, 19,3)";
stmt.executeUpdate(insert);
}catch (SQLException e){
e.printStackTrace();
} finally{
            stmt.close();
        }
}
public static void verEquipo(Connection con)throws SQLException {
	Statement stmt = null;
	String query = "select EQ_NOMBRE,ESTADIO,POBLACION,PROVINCIA from EQUIPO";
	try {
		stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while(rs.next()) {
			String equipo = rs.getString("EQ_NOMBRE");
			System.out.println("Equipo " + equipo);
			String estadio = rs.getString("ESTADIO");
			System.out.println("Estadio " + estadio);
			String poblacion = rs.getString("POBLACION");
			System.out.println("Poblacion " + poblacion);
			String provincia = rs.getString("PROVINCIA");
			System.out.println("Provincia " + provincia);
			
			System.out.println("*********************");
		}
	}catch(SQLException e) {
		e.printStackTrace();
	} finally{
        stmt.close();
    }
	
}
public static void modificacionEquipo(Connection con) throws SQLException {
	Statement stmt = null;
	try{
		stmt = con.createStatement();
		String update = "UPDATE Equipo set ESTADIO='ALBORAN' WHERE team_id=1";
		stmt.executeUpdate(update);
		
	}catch(SQLException e){
		e.printStackTrace();
	}finally {
		stmt.close();
	}
	
}
public static void modificaEdadJugador(Connection con,int cuantoMas) throws SQLException {
	Statement stmt = null;
	try {
		stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		String query = "SELECT * FROM JUGADOR";
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			int i = rs.getInt("edad");
			rs.updateInt("edad", (i+cuantoMas));
			rs.updateRow();
		}
		
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		stmt.close();
	}
	
}
public static void insertaJugador(Connection con,int player_id,int team_id,String nombre,int dorsal,int edad) throws SQLException {
	Statement stmt = null;
	try {
		stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		String query = "SELECT * FROM JUGADOR";
		ResultSet rs = stmt.executeQuery(query);
		
			rs.moveToInsertRow();
			rs.updateInt("player_id", player_id);
			rs.updateInt("team_id", team_id);
			rs.updateString("nombre", nombre);
			rs.updateInt("dorsal", dorsal);
			rs.updateInt("edad", edad);
			rs.insertRow();//Se insertan los datos en el resultset yen la bd
			rs.beforeFirst();//coloca el cursor antes de la primera fila
		
		
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		stmt.close();
	}
	
}
public static void getJugadores(Connection con) throws SQLException {
	 Statement stmt = null;
	 String query ="select dimeCuantos() from jugador;";
	 try{
	 stmt = con.createStatement();
	 ResultSet rs = stmt.executeQuery(query);
	 String cuantos;
	 while(rs.next()){
	 cuantos = rs.getString(1);
	 System.out.println("Existen " + cuantos + " jugadores en nuestra BD");
	 System.out.println("**************************************");
	 }
	 }
	 catch (SQLException e){
	 e.printStackTrace();
	 } finally {
	 stmt.close();
	 }
}
public static void getJugadoresProc(Connection con) throws SQLException {
	 CallableStatement cs = null;
	 try{
	 cs = con.prepareCall("{call cuantosJugadores (?)}");
	//CallableStatement para llamar a la BD
	 cs.registerOutParameter(1, Types.INTEGER);
	 cs.execute();
	 int cuantos = cs.getInt(1);
	 System.out.println("Existen " + cuantos + " jugadores en nuestra BD");
	 System.out.println("**************************************");

	 }
	 catch (SQLException e){
	 e.printStackTrace();
	 } finally {
	 cs.close();
	 }
	}


}
