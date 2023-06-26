package Negocio;

import datos.Factura;

public class Efectivo extends DecoMedPago{

	public Efectivo(Factura factura,Pago pago)
	{
		super(factura, pago);
	}

	@Override
	public double pagar() {
		return this.getFactura().getCosto()*0.8;
	}
}
