package datos;

import Negocio.Pago;

public interface State{
	
	public double pagar(Pago pago);
	public String contratar(Contratacion contratacion);
	public String darBaja(Contratacion contratacion);
}
