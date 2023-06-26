package persistencia;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

import Negocio.Tecnico;
import datos.Abonado;

public class BancoDatosDTO implements Serializable{
	
	private ArrayList<Abonado> abonados;
	private LocalDate fecha;
	
	public BancoDatosDTO(ArrayList<Abonado> abonados, LocalDate fecha) {
		
		this.abonados=abonados;
		this.fecha=fecha;
	}
	
	public ArrayList<Abonado> getAbonados(){
		
		return this.abonados;
	}

	public LocalDate getFecha() {
		return this.fecha;
	}
	
}
