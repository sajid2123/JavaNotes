package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Entidad.Articulo;
import Entidad.Cliente;
import Entidad.Factura;

public class FacturaDAO {
	
	public Factura creaFactura(Connection con,Factura factura,Cliente cliente) throws Exception {
		PreparedStatement stmt=null;
		Factura factura1 = null;
		try {
			
			stmt=con.prepareStatement("insert into factura (Cliente_DNI,Fecha)" 
			                        + "values(?,?)",Statement.RETURN_GENERATED_KEYS);
	
			stmt.setInt(1, cliente.getDNI());
			stmt.setInt(2, factura.getFecha());
			stmt.executeUpdate();
			
			
			ResultSet  rs = stmt.getGeneratedKeys();
			
			if(rs.next()) {
				int i = rs.getInt(1);
				factura1 = new Factura(i,cliente.getDNI(),factura.getFecha());
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
			throw new Exception("Ha habido un problema al insertar Factura" + e.getMessage());
		}finally {
			if(stmt != null) stmt.close();
		}
		return factura1;
		
		
	}
	public void addArticulo(Connection con,Factura factura,Articulo articulo,int numero) throws Exception {
		PreparedStatement stmt=null;
		try {
			
			stmt=con.prepareStatement("insert into articulo_factura (Articulo_idArticulo,Factura_idFactura,Numero)" 
			                        + "values(?,?,?)");
			stmt.setInt(1, articulo.getIdArticulo());
			stmt.setInt(2, factura.getIdFactura());
			stmt.setInt(3, numero);
			stmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
			throw new Exception("Ha habido un problema al insertar articulo" + e.getMessage());
		}finally {
			if(stmt != null) stmt.close();
		}
	}

}
