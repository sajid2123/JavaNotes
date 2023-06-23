package sesion5_1;

import java.sql.*;
import java.util.List;

import DAO.ClienteDAO;
import DAO.Conexion_DB;
import Entidad.Cliente;

public class Main {
	private static void muestraCliente (Cliente cliente1) {
        System.out.println("Cliente DNI->" + cliente1.getDNI());
        System.out.println("Cliente nombre->" + cliente1.getNombre());
        System.out.println("Cliente Primer apellido->"+ cliente1.getApellido1());
        System. out.println("Cliente Segundo apellido->"+ cliente1.getApellido2());
        System.out.println("Cliente Nick->"+ cliente1.getNick());
        System. out.println("Cliente Password->"+ cliente1.getPassword());
        System. out.println("Cliente Saldo->"+ cliente1.getSaldo());
        System.out.println("Cliente Moroso->"+ cliente1.isMoroso());
    }
	public static void main(String[] args) throws Exception {
		Conexion_DB _conexion_DB = new Conexion_DB();
		Connection _con = null;
		
		try
        {
         _con = _conexion_DB.AbrirConexion();
         ClienteDAO _clienteDAO=new ClienteDAO();
         
         Cliente _cliente1=new Cliente();
         
         _cliente1.setDNI(8977);
         _cliente1.setNombre("Alejandro");
         _cliente1.setApellido1("Martinez");
         _cliente1.setApellido2("Blasco");
         _cliente1.setNick("alex");
         _cliente1.setPassword("ale1");
         _cliente1.setSaldo(1000);
         _cliente1.setMoroso(false);
         _clienteDAO.inserta(_con, _cliente1);
         System.out.println("Nuevo Cliente insertado");
        
         _cliente1.setNombre("Juan");
         _clienteDAO.actualiza(_con, _cliente1);
         System.out.println("Cliente actualizado");
         
         Cliente _cliente3 = new Cliente();
         _cliente3.setDNI(25);
         _clienteDAO.elimina(_con, _cliente3);
         System.out.println("Cliente eliminado");
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		
		try {
	        _con = _conexion_DB.AbrirConexion();
	        _con.setAutoCommit(false);
	        _con.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
	        ClienteDAO _clienteDAO=new ClienteDAO();
	        List<Cliente> _clientes=_clienteDAO.findByNumberDNIStart(_con,1);
	        for(int i=0;i<_clientes.size();i++) {
	            System.out.println("CLIENTE CUYO DNI COMIENZA CON 1");
	            _clienteDAO.elimina(_con, _clientes.get(i));
	            System.out.println("Cliente cuyo DNI es" + _clientes.get(i).getDNI());
	        }
	        

		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		_con = _conexion_DB.AbrirConexion();
         ClienteDAO _clienteDAO = new ClienteDAO();
         System.out.println("CLIENTE CUYO DNI ES 8977");
         Cliente _cliente1 = new Cliente();
         _cliente1.setDNI(8977);
         _cliente1 = _clienteDAO.findByDNI(_con, _cliente1);
         muestraCliente(_cliente1);

         System. out.println ("CLIENTE CUYO NICK ES marcs");
         Cliente _cliente2 = new Cliente();
         _cliente2.setNick("marcs");
         _cliente2 = _clienteDAO.findByNick(_con, _cliente2);
         muestraCliente(_cliente2);
         List <Cliente> _clientes1 = _clienteDAO.findByNumberDNIStart(_con, 3);
         for (int i = 0; i < _clientes1.size(); i++) {
             System.out.println("CLIENTE CUYO DNI COMIENZA CON 3");
             muestraCliente(_clientes1.get(i));
         }
         System.out.println("CLIENTE CON MAYOR GASTO");
         Cliente _cliente3 = _clienteDAO.findByMayorGasto(_con);
         muestraCliente(_cliente3);
         
         _conexion_DB.CerrarConexion(_con);
         
	}

}
