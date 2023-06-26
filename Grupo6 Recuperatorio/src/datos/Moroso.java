package datos;

import java.io.Serializable;
import java.util.ArrayList;

import Negocio.Pago;

public class Moroso implements State,Serializable{
	
	private Abonado abonado;
	
	public Moroso(Abonado abonado)
	{
		this.abonado=abonado;
	}

	public double pagar(Pago pago) {
		
		ArrayList<Factura> f=this.abonado.getFacturas();
		int i=0;
		Boolean cumple=true;
		
		while (i<f.size() && cumple)
		{
			if (i!=0 && f.get(i).getPagado()==false && f.get(i-1).getPagado()==false)
				cumple=false;
			else
				i++;
		}
		if (cumple)
			this.abonado.setEstado(new ConContrataciones(this.abonado));
		return 1.3*pago.pagar();
	}

	public String contratar(Contratacion contratacion) {
		
		return "Abonado moroso no puede contratar un servicio.";
	}

	public String darBaja(Contratacion contratacion) {
		
		return "Abonado moroso no puede dar de baja un servicio.";
	}

	public Abonado getAbonado() {
		return this.abonado;
	}

	public void setAbonado(PersonaFisica abonado) {
		this.abonado = abonado;
	}
	
}
