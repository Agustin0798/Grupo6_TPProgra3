package Negocio;

import datos.Factura;

public class Cheque extends DecoMedPago{

	public Cheque(Factura factura,Pago pago) {
		super(factura, pago);
	}

	@Override
	public double pagar() {
		
		return this.getFactura().getCosto()*1.1;
	}

}
