package Negocio;

import datos.Factura;

public class Pago {
	
	private Factura factura;
	
	public Pago(Factura factura) {
		this.factura=factura;
	}
	public double pagar() {
		
		return this.factura.getCosto();
	}
	
	public Factura getFactura() {
		return this.factura;
	}
}
