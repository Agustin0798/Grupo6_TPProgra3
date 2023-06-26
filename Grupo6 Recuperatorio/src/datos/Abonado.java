package datos;

import java.io.Serializable;
import java.util.ArrayList;

import Negocio.Pago;

public abstract class Abonado implements Serializable{
	
	private String nombre;
	private int dni;
	private ArrayList<Factura> facturas;
	private ArrayList<Contratacion> contrataciones;
	private Boolean solicita;
	
	public Abonado(String nombre, int dni)
	{
		this.nombre=nombre;
		this.dni=dni;
		this.facturas=new ArrayList<Factura>();
		this.contrataciones=new ArrayList<Contratacion>();
		this.solicita=false;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return this.dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public ArrayList<Factura> getFacturas() {
		return this.facturas;
	}

	public ArrayList<Contratacion> getContrataciones() {
		return contrataciones;
	}
	
	public Boolean getSolicita() {
		
		return this.solicita;
	}
	
	public void setSolicita(Boolean solicita) {
		
		this.solicita=solicita;
	}
	
	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}

	public void setContrataciones(ArrayList<Contratacion> contrataciones) {
		this.contrataciones = contrataciones;
	}

	public abstract double pagar(Pago pago);
	public abstract String contratar(Contratacion contratacion);
	public abstract String darBaja(Contratacion contratacion);
	public abstract void setEstado(State estado);
	
}
