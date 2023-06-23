package Entidad;

public class Factura {
	private int idFactura;
	private int idCliente;
	private int fecha;
	
	
	public Factura() {
		
	}
	

	public int getIdFactura() {
		return idFactura;
	}
	
	public int getFecha() {
		return fecha;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	
	

	

	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", idCliente=" + idCliente + ", fecha=" + fecha + "]";
	}


	public int getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	public Factura(int idFactura, int idCliente, int fecha) {
		super();
		this.idFactura = idFactura;
		this.idCliente = idCliente;
		this.fecha = fecha;
	}


	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
}
