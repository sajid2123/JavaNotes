package Entidad;

public class Articulo {
	
	private int idArticulo;
	private String descripcion;
	private float precio;
	private int stock;
	
	
	public int getIdArticulo() {
		return idArticulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public float getPrecio() {
		return precio;
	}
	public int getStock() {
		return stock;
	}
	public void setIdArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	

}
