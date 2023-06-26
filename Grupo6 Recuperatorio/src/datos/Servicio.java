package datos;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Servicio implements Serializable{
	
	private ArrayList<Adicional> adicionales;
	protected double costoBase,costoTot;
	protected Promo promo;
	
	public Servicio()
	{
		this.adicionales=new ArrayList<Adicional>();
		this.promo=null;
	}

	public ArrayList<Adicional> getAdicionales() {
		return adicionales;
	}

	public void setPromo(Promo promo) {
		this.promo = promo;
	}

	public double getCostoBase() {
		return costoBase;
	}

	public Promo getPromo() {
		return this.promo;
	}
	

	public void setCostoBase(double costoBase) {
		this.costoBase = costoBase;
	}
	
	public abstract double masPromo(double costo);
	
	public void setCostoTot()
	{
		ArrayList<Adicional> a=this.adicionales;
		double aux=0;
		
		for (Adicional ad:a)
		{
			aux+=ad.getCostoAdicional();
		}
		
		aux+=this.costoBase;
		
		if (this.promo==null)
			this.costoTot=aux;
		else
		{
			aux=this.masPromo(aux);
			this.costoTot=aux;
		}
	}
	
	public double getCostoTot()
	{
		return this.costoTot;
	}

	public void setAdicionales(ArrayList<Adicional> adicionales) {
		this.adicionales = adicionales;
	}

	public void setCostoTot(double costoTot) {
		this.costoTot = costoTot;
	}
	
	
}
