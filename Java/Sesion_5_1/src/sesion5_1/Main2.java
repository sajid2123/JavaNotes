package sesion5_1;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;

import DAO.ArticuloDAO;
import DAO.ClienteDAO;
import DAO.Conexion_DB;
import DAO.FacturaDAO;
import Entidad.Articulo;
import Entidad.Cliente;
import Entidad.Factura;

public class Main2 {

	public static void main(String[] args) throws Exception {
	//pruebaEjercicio2();
	}
	public static void pruebaEjercicio2() throws Exception {
		Conexion_DB _conexion_DB = new Conexion_DB();
		Connection _con = null;
		_con = _conexion_DB.AbrirConexion();
		
		
		
		ClienteDAO clienteDAO=new ClienteDAO();
		Cliente _cliente=new Cliente();
		_cliente.setDNI(367809);
		_cliente=clienteDAO.findByDNI(_con, _cliente);
		
		
		ArticuloDAO articuloDAO = new ArticuloDAO();
		Articulo articulo=new Articulo();
		articulo.setIdArticulo(1);
		articulo=articuloDAO.findById(_con, articulo);
		
		
		FacturaDAO facturaDAO = new FacturaDAO();
		Factura factura=new Factura();
		
		
		Date ahora = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		int fecha=Integer.parseInt(sdf.format(ahora));
		
		factura.setFecha(fecha);
		factura=facturaDAO.creaFactura(_con, factura, _cliente);
		facturaDAO.addArticulo(_con, factura, articulo, 2);
		articulo.setStock(articulo.getStock()-2);
		articuloDAO.updateStock(_con, articulo);
		_cliente.setSaldo(_cliente.getSaldo()-(articulo.getPrecio()*2));
		clienteDAO.updateSaldo(_con, _cliente);
		
	}
	

}
