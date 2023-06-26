package persistencia;

import Negocio.BancoDatos;

public class ConversorDTO {
	
	public static BancoDatosDTO persistir(BancoDatos bd) {
		
		BancoDatosDTO bddto=new BancoDatosDTO(bd.getAbonados(), bd.getFecha());
		return bddto;
	}
}
