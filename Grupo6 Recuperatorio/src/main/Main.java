package main;

import Negocio.BancoDatos;
import controlador.Control;
import persistencia.BancoDatosDTO;
import persistencia.ConversorDTO;
import persistencia.Persistencia;

public class Main {

	private static BancoDatos datos;

	public static void main(String[] args) {
		
		Persistencia persistencia=new Persistencia();
		datos = null;
		Control controlador;
		BancoDatosDTO bddto;
		
		controlador= new Control(datos.getInstancia(persistencia.despersistir()));
		bddto=ConversorDTO.persistir(controlador.getBancoDatos());
		persistencia.persistir(bddto);
	}

}
