package datos;

import Negocio.Pago;

public class PersonaJuridica extends Abonado{
	
	public PersonaJuridica(String nombre, int dni)
	{
		super(nombre,dni);
	}

	@Override
	public double pagar(Pago pago) {
		
		if (super.getFacturas().size()>=3)
			return pago.pagar()/2;
		else
			return pago.pagar();
	}
	
	public String contratar(Contratacion contratacion) {
		
		super.getContrataciones().add(contratacion);
		return "Servicio contratado con exito.";
	}
	
	public String darBaja(Contratacion contratacion) {
		
		super.getContrataciones().remove(contratacion);
		return "Servicio dado de baja con exito.";
	}

	@Override
	public void setEstado(State estado) {
		
	}
}
