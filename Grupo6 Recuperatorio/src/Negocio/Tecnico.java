package Negocio;

import java.util.Random;

public class Tecnico implements Runnable{

	private int id;
	private BancoDatos datos;
	
	public Tecnico(int id)
	{
		this.id=id;
	}
	
	public int getId() {
		
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void run() {
		
		Random random=new Random();
		while (true) {// lo hago para que el tecnico este todo el tiempo que el programa este activo mirando si hay solicitudes
			this.datos.tomar(this);
			try {
				Thread.sleep(1000*(random.nextInt(10)+1));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			
	}
	
	
}
