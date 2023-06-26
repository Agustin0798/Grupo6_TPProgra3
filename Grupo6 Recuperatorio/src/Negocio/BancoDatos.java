package Negocio;


import java.util.ArrayList;
import java.util.Random;
import java.time.LocalDate;
import java.time.Month;

import datos.Abonado;
import datos.BotonPanico;
import datos.Camara;
import datos.Contratacion;
import datos.Factura;
import datos.MonitoreoComercio;
import datos.MonitoreoVivienda;
import datos.Moroso;
import datos.PDorada;
import datos.PPlatino;
import datos.PersonaFisica;
import datos.PersonaJuridica;
import datos.Servicio;
import datos.Vigilante;
import persistencia.BancoDatosDTO;

public class BancoDatos extends Observable{

	private ArrayList<Abonado> abonados;
	private Boolean solicitud=false;
	private LocalDate fecha;
	private int idCont;
	private static BancoDatos instancia=null;
	
	private BancoDatos(ArrayList<Abonado> abonados, LocalDate fecha) {
		
		this.abonados=abonados;
		this.fecha=fecha;
		
	}
	
	public BancoDatos getInstancia(BancoDatosDTO bddto) {
		
		if (instancia == null)
			instancia=new BancoDatos(bddto.getAbonados(),bddto.getFecha());
		Generador generador=new Generador(this);
		Thread t=new Thread(generador);
		t.start();
		return instancia;
	}

	public ArrayList<Abonado> getAbonados() {
		return this.abonados;
	}

	public void setAbonados(ArrayList<Abonado> abonados) {
		this.abonados = abonados;
		this.notifyObserver("Seteado el array de abonados.");
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
		this.notifyObserver("Seteada la fecha.");
	}

	public void addAbonado(Abonado abonado) {
		
		this.abonados.add(abonado);
		this.notifyObserver("Abonado registrado con exito.");
	}
	public void removeAbonado(Abonado abonado) {
		
		this.abonados.remove(abonado);
		this.notifyObserver("Abonado eliminado con exito.");
	}
	
	public int buscaAbonado(String nombre) {
		
		int i=0;
		
		while(i< this.abonados.size() && this.abonados.get(i).getNombre() != nombre) {
			i++;
		}
		if (i< this.abonados.size())
			return i;
		else
			return -1;
	}
	
	public int buscaFactura(Abonado abonado, LocalDate fecha) {
		
		int i=0;
		
		while (i< abonado.getFacturas().size() && abonado.getFacturas().get(i).getFecha()!=fecha)
			i++;
		if (i < abonado.getFacturas().size())
			return i;
		else
			return -1;
	}
	
	public int buscaContratacion(Abonado abonado, String domicilio) {
		
		int i=0;
		
		while (i< abonado.getContrataciones().size() && abonado.getContrataciones().get(i).getDomicilio() != domicilio)
			i++;
		if (i < abonado.getContrataciones().size())
			return i;
		else
			return -1;
	}
	
	
	public ArrayList<Factura> getFacturas(String nAbonado) {
		
		int i=buscaAbonado(nAbonado);
		
		if (i != -1)
			return this.abonados.get(i).getFacturas();
		else
			return null;
	}
	
	public String nuevoAbonado(String nombre, String dni, String tipo) {
		
		Abonado abonado;
		int i=buscaAbonado(nombre);
		
		if (i == -1) {
			if (tipo == "Persona Fisica") {
				abonado= new PersonaFisica(nombre,Integer.parseInt(dni));
				abonados.add(abonado);
			} else {
				abonado= new PersonaJuridica(nombre,Integer.parseInt(dni));
				abonados.add(abonado);
			}
			return "Abonado agregado con exito.";
		}else
			return "El abonado ya existe en el sistema. ";
			
	}
	
	public String bajaCliente(String nAbonado) {
		
		int i=buscaAbonado(nAbonado);
		
		if (i != -1) {
			this.abonados.remove(i);
			return "El cliente fue eliminado del sistema. ";
		}else 
			return "Nombre de cliente invalido. ";
	}
	
	public String bajaServicio(String nAbonado, String domicilio) {
		
		int i=buscaAbonado(nAbonado);
		int j=0;
		
		if (i != -1) {
			while(j < this.abonados.get(i).getContrataciones().size() && this.abonados.get(i).getContrataciones().get(j).getDomicilio() != domicilio) {
				j++;
			}
			if (j < this.abonados.get(i).getContrataciones().size()) {
				this.abonados.get(i).getContrataciones().remove(j);
				return "Operacion Exitosa.";
			}else 
				return "Domicilio no registrado.";
		}else
			return "El abonado no existe en el sistema";
	}
	public String contratar(String nAbonado, String domicilio, String servicio) {
		
		Contratacion contratacion;
		Servicio nuevoS;
		int i;
		
		if (servicio == "Monitoreo Vivienda") {
			nuevoS= new MonitoreoVivienda();
		} else {
			nuevoS=new MonitoreoComercio();
		}
		contratacion= new Contratacion(domicilio,this.idCont,nuevoS);
		i=buscaAbonado(nAbonado);
		if (i != -1) {
			this.abonados.get(buscaAbonado(nAbonado)).getContrataciones().add(contratacion);
			return "Operacion Exitosa";
		}else {
			return "El abonado no existe en el sistema. ";
		}
	}
	
	public String agregarAdicionales(String nAbonado, String domicilio, String adicional) {
		
		int i=buscaAbonado(nAbonado);
		
		if (i != -1) {
			int j=buscaContratacion(this.abonados.get(i),domicilio);
			if (j != -1) {
				if (adicional == "Camara") {
					this.abonados.get(i).getContrataciones().get(j).getServicio().getAdicionales().add(new Camara());
				}else if (adicional == "Vigilante") {
					this.abonados.get(i).getContrataciones().get(j).getServicio().getAdicionales().add(new Vigilante());
				}else {
					this.abonados.get(i).getContrataciones().get(j).getServicio().getAdicionales().add(new BotonPanico());
				}
				return "Adicional agregado con exito. ";
			}else
				return "Domicilio no registrado. ";
		}else
			return "El abonado no existe en el sistema. ";
	}
	
	public String pagar(String nAbonado, LocalDate fecha, String medPago) {
		
		Pago pago;
		int i=buscaAbonado(nAbonado);
		int j=buscaFactura(this.abonados.get(i),fecha);
		String resultado;
		
		if (i != -1) {
			if (j != -1) {
				if (this.abonados.get(i).getFacturas().get(j).getPagado() == false) {
					pago=new Pago(this.abonados.get(i).getFacturas().get(j));
					this.abonados.get(i).getFacturas().get(j).setPagado(true);
					resultado="Costo Total: $"+this.abonados.get(i).pagar(pago)+". ";
					if (medPago == "Efectivo") {
						pago= new Efectivo(pago.getFactura(),pago);
					}else if (medPago == "Tarjeta") {
						pago= new Tarjeta(pago.getFactura(),pago);
					}else {
						pago= new Cheque(pago.getFactura(),pago);
					}
					resultado+="Costo Final: $"+this.abonados.get(i).pagar(pago)+". ";
				}else
					resultado="La factura elegida ya esta pagada. ";
			}else
				resultado="No hay una factura con la fecha indicada. ";
		}else
			resultado="El abonado no existe en el sistema";
		return resultado;
	}
	
	public String aplicarPromo(String promo) {
		
		if (promo == "Dorada") {
			for (Abonado abonado:abonados) {
				for (Contratacion contratacion:abonado.getContrataciones()) {
					contratacion.getServicio().setPromo(new PDorada());
				}
			}
		}else {
			for (Abonado abonado:abonados) {
				for (Contratacion contratacion:abonado.getContrataciones()) {
					contratacion.getServicio().setPromo(new PPlatino());
				}
			}
		}
		return "Promo aplicada";
	}
	
	public String quitarPromo() {
		
		for (Abonado abonado:abonados) {
			for (Contratacion contratacion:abonado.getContrataciones()) {
				contratacion.getServicio().setPromo(null);
			}
		}
		return "Promo retirada";
	}
	
	public void facturar() {
		
		Month m=this.fecha.getMonth();
		ArrayList<Abonado> ab=this.abonados;
		
		if (m==Month.DECEMBER)
			this.fecha=LocalDate.of(this.fecha.getYear()+1,Month.JANUARY,this.fecha.getDayOfMonth());
		else
			this.fecha=LocalDate.of(this.fecha.getYear(),m.getValue()+1,this.fecha.getDayOfMonth());
		for (Abonado a:ab)
		{
			double costo=0;
			for (Contratacion c:a.getContrataciones())
			{
				costo+=c.getCosto();
			}
			
			Factura f=new Factura(this.fecha, costo);
			int i=0;
			Boolean cumple=true;
			
			while (i<a.getFacturas().size() && cumple)
			{
				if (i>0 && a.getFacturas().get(i).getPagado()==false && a.getFacturas().get(i-1).getPagado()==false)
					cumple=false;
				else
					i++;
			}
			if (!cumple)
				a.setEstado(new Moroso(a));
			a.getFacturas().add(f);
		}
		this.notifyObserver("Cambio de fecha y emision de facturas exitosa.");
	}
	
	public void generaSolicitudes() {
		
		Thread s1,s2,s3,t1,t2,t3;
		Random random=new Random();
		Solicitante so1,so2,so3;
		Tecnico te1,te2,te3;
		int i;
		Abonado a;
		
		te1=new Tecnico(1);
		te2=new Tecnico(2);
		te3=new Tecnico(3);
		t1=new Thread(te1);		//genero los tecnicos
		t2=new Thread(te2);
		t3=new Thread(te3);
		t1.start();
		t2.start();
		t3.start();
		while (true) { //que se generen solicitudes durante todo el funcionamiento del programa
			i=random.nextInt(this.abonados.size());
			a=this.abonados.get(i);
			so1=new Solicitante(a.getNombre(),a.getDni(),this);
			i=random.nextInt(this.abonados.size());
			a=this.abonados.get(i);
			so2=new Solicitante(a.getNombre(),a.getDni(),this);		//genero solicitantes con la info de un abonado al azar
			i=random.nextInt(this.abonados.size());
			a=this.abonados.get(i);
			so3=new Solicitante(a.getNombre(),a.getDni(),this);
			s1=new Thread(so1);
			s2=new Thread(so2);
			s3=new Thread(so3);
			s1.start();
			s2.start();
			s3.start();
			try {
				Thread.sleep((i+1)*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void solicitar(Solicitante solicitante) {
		
		while (this.solicitud == true)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.solicitud=true;
		notifyAll();
		notifyObserver("El abonado "+solicitante.getNombre()+" solicito un tecnico. ");
	}
	
	public synchronized void tomar(Tecnico tecnico){
		
		while (this.solicitud== false)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.solicitud=false;
		notifyAll();
		notifyObserver("El tecnico id: "+tecnico.getId()+" esta trabajando. ");
	}

	@Override
	public void notifyObserver(String string) {
		
		super.getObservador().update(string);
	}
}
