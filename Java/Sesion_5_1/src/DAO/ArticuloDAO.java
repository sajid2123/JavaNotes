package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Entidad.Articulo;
import Entidad.Cliente;


public class ArticuloDAO {
	
	
	public void updateStock(Connection con, Articulo articulo ) throws Exception {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement ("update articulo set Stock=?  WHERE idArticulo=?");
            stmt.setInt(1, articulo.getStock());
			stmt.setInt(2, articulo.getIdArticulo());
			stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			throw new Exception("Ha habido un problema al actualizar stock" + e.getMessage());
		}finally {
			if(stmt != null) stmt.close();
		}
    }
	public Articulo findById(Connection con, Articulo articulo) throws Exception {
        Articulo articulo1 = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement ("SELECT * FROM articulo WHERE idArticulo=?");
            stmt.setInt(1, articulo.getIdArticulo());
            rs =  stmt.executeQuery();
                while (rs.next()) {
                    articulo1 = new Articulo();
                    obtenArticuloFila(rs, articulo1);
                }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new Exception ("Ha habido un problema al buscar el cliente por DNI " + ex.getMessage ());
        } finally {
            if (rs != null) rs.close();
            if (rs != null) stmt.close();            
        }
		return articulo1;
    }
	private void obtenArticuloFila (ResultSet rs, Articulo articulo) throws SQLException {
        articulo.setIdArticulo(rs.getInt("idArticulo"));
        articulo.setDescripcion(rs.getString("Descripcion"));
        articulo.setPrecio(rs.getFloat("Precio"));
        articulo.setStock(rs.getInt("Stock"));
       
    }
	
}
