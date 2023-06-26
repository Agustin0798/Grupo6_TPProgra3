package datos;

import java.io.Serializable;

public class PPlatino implements Promo,Serializable{
	
	public double masMComercio(double costo)
	{
		return costo*0.65;
	}
	
	public double masMVivienda(double costo)
	{
		return costo*0.7;
	}
}
