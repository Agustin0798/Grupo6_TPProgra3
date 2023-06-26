package datos;

import java.io.Serializable;

import Negocio.Pago;

public class ConContrataciones implements State,Serializable{
	
	private Abonado abonado;
	
	public ConContrataciones(Abonado abonado)
	{
		this.abonado=abonado;
	}


	public double pagar(Pago pago) {
		
		return pago.pagar();
	}

	public String contratar(Contratacion contratacion) {
		
		this.abonado.getContrataciones().add(contratacion);
		return "Servicio contratado con exito";
	}

	public String darBaja(Contratacion contratacion) {
		
		this.abonado.getContrataciones().remove(contratacion);
		if (this.abonado.getContrataciones().isEmpty())
			this.abonado.setEstado(new SinContrataciones(this.abonado));
		return "Servicio dado de baja con exito.";
	}
	
	public Abonado getAbonado() {
		return this.abonado;
	}

	public void setAbonado(PersonaFisica abonado) {
		this.abonado = abonado;
	}
}
