package datos;

import java.io.Serializable;

public class PDorada implements Promo,Serializable{
	
	public double masMComercio(double costo)
	{
		return costo-2500;
	}
	
	public double masMVivienda(double costo)
	{
		return costo-1500;
	}
	
	
}
