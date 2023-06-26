package Negocio;

import datos.Factura;

public abstract class DecoMedPago extends Pago{
	
	Pago pago;

	public DecoMedPago(Factura factura,Pago pago) {
		super(factura);
	}
	
	public abstract double pagar();
}
