package datos;

public class MonitoreoComercio extends Servicio{
	
	public MonitoreoComercio()
	{
		super();
		super.setCostoBase(10000);
	}

	@Override
	public double masPromo(double costo) {
		
		return super.getPromo().masMComercio(costo);
	}
}
