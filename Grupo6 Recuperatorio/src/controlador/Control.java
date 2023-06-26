package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import vista.IVista;
import vista.VistaPrincipal;
import Negocio.BancoDatos;
import datos.Factura;
import vista.VistaPrincipal;
import vista.Clientes;


public class Control implements ActionListener {
	
	private IVista vista;
	private BancoDatos bancoDatos;
	private String nombre;
	
	public Control(BancoDatos bancoDatos) {
		this.vista = (IVista) new VistaPrincipal(this);
		this.vista.setActionListener(this);
		this.vista.mostrar();
		this.bancoDatos = bancoDatos;
	}
	
	public BancoDatos getBancoDatos() {
		return this.bancoDatos;
	}
	
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		
		if(comando.equalsIgnoreCase("FACTURAR")) {
			VistaPrincipal ventana = (VistaPrincipal) this.vista;
			
			this.bancoDatos.facturar();
			String label = this.getFecha();
			
			ventana.setFecha(label);
			
		} else if(comando.equalsIgnoreCase("INGRESAR")) {
			VistaPrincipal ventana = (VistaPrincipal) this.vista;
			
			nombre = ventana.getCliente().getText();
			
			this.vista.cerrar();
			
			this.vista = (IVista) new Clientes(this);
			this.vista.mostrar();
						
		} else if (comando.equalsIgnoreCase("DARDEBAJA")) {
			VistaPrincipal ventana = (VistaPrincipal) this.vista;
			
			nombre = ventana.getCliente().getText();
			
			String label = this.bancoDatos.bajaCliente(nombre);
			
			ventana.setLabel(label);
		} else if (comando.equalsIgnoreCase("AGREGAR")) {
			VistaPrincipal ventana = (VistaPrincipal) this.vista;
			
			nombre = ventana.getCliente().getText();
			String dni = ventana.getDNI().getText();
			if(ventana.selectedButton()!= null) {
				String comando1 = ventana.selectedButton().getActionCommand();
				if(comando1.equalsIgnoreCase("JURIDICA")) {
					String label = this.bancoDatos.nuevoAbonado(nombre,dni,"Persona Juridica");
					ventana.setLabel(label);
				}else if (comando1.equalsIgnoreCase("FISICA")){
					String label = this.bancoDatos.nuevoAbonado(nombre,dni,"Persona Fisica");
					ventana.setLabel(label);
				}
			} else {
				ventana.setLabel("Debes seleccionar tipo persona");
			}
		} else if (comando.equalsIgnoreCase("INICIO")){
			this.vista.cerrar();
			
			this.vista = (IVista) new VistaPrincipal(this);
			this.vista.mostrar();
		} else if (comando.equalsIgnoreCase("PAGAR")){
			Clientes ventana = (Clientes) this.vista;
			
			if(ventana.selectedOption()!= null) {
				DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		        LocalDate fecha = LocalDate.parse(ventana.selectedOption(), formato);
	
		        if(ventana.selectedButtonPagar()!= null) {
		        	 String comando1 = ventana.selectedButtonPagar().getActionCommand();
		        	 
		        	 if(comando1.equalsIgnoreCase("TARJETA")) {
		        		 String label = this.bancoDatos.pagar(nombre,fecha,"Tarjeta");
		        		 ventana.setLabelPagar(label);
		        	 } else if(comando1.equalsIgnoreCase("CHEQUE")) {
		        		 String label = this.bancoDatos.pagar(nombre,fecha,"Cheque");
		        		 ventana.setLabelPagar(label);
		        	 } else if(comando1.equalsIgnoreCase("EFECTIVO")) {
		        		 String label = this.bancoDatos.pagar(nombre,fecha,"Efectivo");
		        		 ventana.setLabelPagar(label);
		        	 }
		        } else {
		        	ventana.setLabelPagar("Debes seleccionar forma de pago");
		        }
			}else {
				ventana.setLabelPagar("Debes seleccionar una factura");
			}
		} else if (comando.equalsIgnoreCase("BAJASERVICIO")) {
			Clientes ventana = (Clientes) this.vista;
			
			String domicilio = ventana.getDomicilioBS().getText();
			
			String label = this.bancoDatos.bajaServicio(nombre,domicilio);
			ventana.setLabelBajaServicio(label);
		} else if (comando.equalsIgnoreCase("AÑADIRSERVICIO")) {
			Clientes ventana = (Clientes) this.vista;
			
			String domicilio = ventana.getDomicilioAS().getText();
			if(ventana.selectedButtonAS()!= null) {
				String comando1 = ventana.selectedButtonAS().getActionCommand();
				if(comando1.equalsIgnoreCase("VIVIENDA")) {
	        		 String label = this.bancoDatos.contratar(nombre,domicilio,"Monitoreo Vivienda");
	        		 ventana.setLabelAñadirServicio(label);
	        	} else if(comando1.equalsIgnoreCase("COMERCIO")) {
	        		 String label = this.bancoDatos.contratar(nombre,domicilio,"Monitoreo Comercio");
	        		 ventana.setLabelAñadirServicio(label);
	        	}
			} else {
				ventana.setLabelAñadirServicio("Debes seleccionar un servicio");
			}
		} else if (comando.equalsIgnoreCase("AGREGARADICIONAL")) {
			Clientes ventana = (Clientes) this.vista;
			
			String domicilio = ventana.getDomicilioAA().getText();
			if(ventana.selectedButtonAA()!= null) {
				String comando1 = ventana.selectedButtonAA().getActionCommand();
				if(comando1.equalsIgnoreCase("VIGILANTE")) {
	        		 String label = this.bancoDatos.agregarAdicionales(nombre,domicilio,"Vigilante");
	        		 ventana.setLabelAgregarAdicional(label);
	        	} else if(comando1.equalsIgnoreCase("BOTONANTIPANICO")) {
	        		 String label = this.bancoDatos.agregarAdicionales(nombre,domicilio,"Boton Panico");
	        		 ventana.setLabelAgregarAdicional(label);
	        	} else if(comando1.equalsIgnoreCase("CAMARAS")) {
	        		 String label = this.bancoDatos.agregarAdicionales(nombre,domicilio,"Camara");
	        		 ventana.setLabelAgregarAdicional(label);
	        	}
			} else {
				ventana.setLabelAñadirServicio("Debes seleccionar un adicional");
			}
		} else if (comando.equalsIgnoreCase("APLICAR")) {
			VistaPrincipal ventana = (VistaPrincipal) this.vista;
			
			if(ventana.selectedButtonPromo()!= null) {
				String comando1 = ventana.selectedButtonPromo().getActionCommand();
				if(comando.equalsIgnoreCase("DORADA")) {
					String label = this.bancoDatos.aplicarPromo("Dorada");
					ventana.setLabel(label);
				} else if (comando.equalsIgnoreCase("PLATINO")) {
					String label = this.bancoDatos.aplicarPromo("Platino");
					ventana.setLabel(label);
				}
			} 
		} else if (comando.equalsIgnoreCase("QUITAR")) {
			VistaPrincipal ventana = (VistaPrincipal) this.vista;
			
			String label = this.bancoDatos.quitarPromo();
			ventana.setLabel(label);
		}
	
		
		
	}

	public ArrayList<Factura> getDatos(String nombre) {
		return this.bancoDatos.getFacturas(nombre);
	}

	public String getFecha() {
		LocalDate fecha = this.bancoDatos.getFecha(); // Obtener la fecha actual
	    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Definir el formato deseado
	    String fechaString = fecha.format(formato);
	    
	    return fechaString;	       
	}
	
	public String getNombre() {
		return this.nombre;
	}


}
