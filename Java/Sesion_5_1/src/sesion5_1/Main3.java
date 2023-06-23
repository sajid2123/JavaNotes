package sesion5_1;

import java.sql.Connection;

import DAO.ClienteDAO;
import DAO.Conexion_DB;
import Entidad.Cliente;
import Entidad.Factura;

public class Main3 {

	public static void main(String[] args) throws Exception {
		pruebaEjercicio3();
	}
	public static void pruebaEjercicio3() throws Exception {
		Conexion_DB _conexion_DB = new Conexion_DB();
		Connection _con = null;
		
		
		try {
			_con = _conexion_DB.AbrirConexion();
			ClienteDAO clienteDAO = new ClienteDAO();
			Cliente _cliente = new Cliente();
			_cliente.setDNI(456781);
			_cliente=clienteDAO.getClienteFacturas(_con, _cliente);
			
			for(int i=0;i<_cliente.getFacturas().size();i++) {
				Factura factura=_cliente.getFacturas().get(i);
				System.out.println("Factura encontrada con ID=" + factura.getIdFactura()+ "y Fecha" + factura.getFecha());
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			if(_con!=null) _conexion_DB.CerrarConexion(_con);
		}
		
		
	}
}
