package datos;

import java.io.Serializable;

public class Contratacion implements Serializable{
	
	private String domicilio;
	private int id;
	private Servicio servicio;
	
	public Contratacion(String domicilio, int id, Servicio servicio)
	{
		this.domicilio=domicilio;
		this.id=id;
		this.servicio=servicio;
	}
	
	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public String getDomicilio() {
		return this.domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Servicio getServicios() {
		return this.servicio;
	}
	
	public double getCosto() {
		return this.servicio.getCostoTot();
	}
	
}
