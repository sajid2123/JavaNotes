package Entidad;

import java.util.ArrayList;

public class Cliente {
	
	private int DNI;
	private String Nombre;
	private String Apellido1;
	private String Apellido2;
	private String Nick;
	private String password;
	private boolean moroso = false;
	private float saldo=0;
	private ArrayList<Factura> facturas = new ArrayList<Factura>() ;
	
	public void addFactura(Factura f) {
		facturas.add(f);
	}
	public ArrayList<Factura> getFacturas() {
		return facturas;
	}

	public int getDNI() {
		return DNI;
	}
	public String getNombre() {
		return Nombre;
	}
	@Override
	public String toString() {
		return "Cliente [DNI=" + DNI + "]";
	}
	public String getApellido1() {
		return Apellido1;
	}
	public String getApellido2() {
		return Apellido2;
	}
	public String getNick() {
		return Nick;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public String getPassword() {
		return password;
	}
	public boolean isMoroso() {
		return moroso;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public void setApellido1(String apellido1) {
		Apellido1 = apellido1;
	}
	public void setApellido2(String apellido2) {
		Apellido2 = apellido2;
	}
	public void setNick(String nick) {
		Nick = nick;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setMoroso(boolean moroso) {
		this.moroso = moroso;
	}
	
	
	
	

}
