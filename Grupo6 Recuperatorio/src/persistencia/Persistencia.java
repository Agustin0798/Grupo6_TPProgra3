package persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import Negocio.BancoDatos;

public class Persistencia {

	private BancoDatosDTO bddto;
	
	public BancoDatosDTO getBddto() {
		return this.bddto;
	}
	
	public BancoDatosDTO despersistir() {
		
		ObjectInputStream entrada = null;
		this.bddto=null;
		try {
			entrada=new ObjectInputStream(new FileInputStream("Datos.bin"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (entrada != null)
			try {
				this.bddto=(BancoDatosDTO) entrada.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		return this.bddto;
	}
	
	public void persistir(BancoDatosDTO bddto) {
		
		ObjectOutputStream salida=null;
		try {
			salida=new ObjectOutputStream(new FileOutputStream("Datos.bin"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (salida != null)
			try {
				salida.writeObject(bddto);
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
}

