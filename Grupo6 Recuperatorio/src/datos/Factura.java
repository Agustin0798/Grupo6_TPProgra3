package datos;

import java.io.Serializable;
import java.time.LocalDate;


public class Factura implements Serializable{
	
	private LocalDate fecha;
	private double costo;
	private Boolean pagado;
	
	public Factura(LocalDate fecha,double costo)
	{
		this.fecha=fecha;
		this.costo=costo;
		this.pagado=false;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
	public double getCosto() {
		return this.costo;
	}

	public Boolean getPagado() {
		return pagado;
	}

	public void setPagado(Boolean pagado) {
		this.pagado = pagado;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	
}
