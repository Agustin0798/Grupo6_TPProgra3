package datos;

import Negocio.Pago;

public class PersonaFisica extends Abonado{
	
	State estado;
	
	public PersonaFisica(String nombre, int dni) {
		super(nombre, dni);
		estado=new SinContrataciones(this);
	}

	public State getEstado() {
		return estado;
	}

	public void setEstado(State estado) {
		this.estado = estado;
	}

	public double pagar(Pago pago) {
		
		return this.estado.pagar(pago);
	}
	
	public String contratar(Contratacion contratacion) {
		
		return this.estado.contratar(contratacion);
	}
	
	public String darBaja(Contratacion contratacion) {
		
		return this.estado.darBaja(contratacion);
	}
}
