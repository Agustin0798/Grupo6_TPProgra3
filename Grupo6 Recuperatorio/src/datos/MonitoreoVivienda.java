package datos;

public class MonitoreoVivienda extends Servicio{
	
	public MonitoreoVivienda()
	{
		super();
		super.setCostoBase(8500);
	}

	@Override
	public double masPromo(double costo) {
		
		return super.getPromo().masMVivienda(costo);
	}
}
