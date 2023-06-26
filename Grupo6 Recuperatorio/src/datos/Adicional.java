package datos;

import java.io.Serializable;

public abstract class Adicional implements Serializable{

	private double costoAdicional;

	public double getCostoAdicional() {
		return this.costoAdicional;
	}

	public void setCostoAdicional(double costoAdicional) {
		this.costoAdicional = costoAdicional;
	}
	
	
}
