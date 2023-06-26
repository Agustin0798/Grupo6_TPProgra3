package Negocio;

import java.lang.Thread;
import java.util.Random;

public class Solicitante implements Runnable{
	
	private String nombre;
	private int dni;
	private BancoDatos datos;
	
	public Solicitante(String nombre, int dni, BancoDatos datos) {
		
		this.nombre=nombre;
		this.dni=dni;
		this.datos=datos;
	}

	public void run() {
		
		Random random=new Random();
		this.datos.solicitar(this);
		try {
			Thread.sleep(1000*(random.nextInt(10)+1));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getNombre() {
		return nombre;
	}

	public int getDni() {
		return dni;
	}
}
