package cuenta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestCuneta {

	public static void main(String[] args) {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cuenta","root","sajid");
			con.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
		}catch(SQLException e){
			e.printStackTrace();
		}
		transaccion(con,"cuenta",1,5,200);
		
	}
	public static void transaccion(Connection con,String BDnombre,int cuentaA,int cuentaB,int cantidad) {
		String actualizaA = "update " +BDnombre +".CUENTA "+
							"set SALDO = SALDO - " + cantidad+" where NUMCUENTA = " + cuentaA;
		String actualizaB = "update " +BDnombre +".CUENTA "+
				"set SALDO = SALDO + " + cantidad+" where NUMCUENTA = " + cuentaB;
		Statement stmt = null;
		try {
			con.setAutoCommit(false);
			stmt=con.createStatement();
			
			stmt.executeUpdate(actualizaA);
			stmt.executeUpdate(actualizaB);
			
			con.commit();
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("en el catch");
			if(con!=null) {
				try {
					System.out.println("Roll back de la transaccion");
					con.rollback();
				}catch(SQLException ex) {
					printSQLException(ex);
				}
			}else {
				System.out.println("Conexion cerrada");
			}
		}finally {
			try {
				stmt.close();
				con.setAutoCommit(true);
					
				
			}catch(java.sql.SQLException e1) {
				printSQLException(e1);
			}
			
		}
		
	}
	public static void printSQLException(SQLException ex) {
		ex.printStackTrace(System.err);
		System.err.println("SqlState" +  ex.getSQLState());
		System.err.println("SqlState" +  ex.getErrorCode());
		System.err.println("SqlState" +  ex.getMessage());
		
	}
}
