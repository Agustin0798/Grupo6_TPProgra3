package Negocio;

import datos.Factura;

public class Tarjeta extends DecoMedPago{

	public Tarjeta(Factura factura,Pago pago) {
		super(factura, pago);
	}

	@Override
	public double pagar() {
		
		return this.getFactura().getCosto()*1.05;
	}
}
