package Negocio;

public class Generador implements Runnable{

	private BancoDatos datos;
	
	public Generador(BancoDatos datos) {
		this.datos=datos;
	}
	public void run() {
		
		this.datos.generaSolicitudes();
	}

}
