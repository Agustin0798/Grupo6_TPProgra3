package datos;

import java.io.Serializable;

import Negocio.Pago;

public class SinContrataciones implements State,Serializable{
	
	private Abonado abonado;
	
	public SinContrataciones(Abonado abonado)
	{
		this.abonado=abonado;
	}

	public double pagar(Pago pago) {
		
		return 0;
	}

	public String contratar(Contratacion contratacion) {
		this.abonado.getContrataciones().add(contratacion);
		this.abonado.setEstado(new ConContrataciones(this.abonado));
		return "Servicio contratado con exito";
	}

	public String darBaja(Contratacion contratacion) {
	
		return "No hay servicios para dar de baja";
	}

	public Abonado getAbonado() {
		return this.abonado;
	}

	public void setAbonado(PersonaFisica abonado) {
		this.abonado = abonado;
	}
	
	
}
