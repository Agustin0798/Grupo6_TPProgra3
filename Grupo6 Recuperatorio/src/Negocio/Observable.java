package Negocio;


public abstract class Observable {

	private Observador observador;
	
	public Observable() {
		
		this.observador=null;
	}
	
	public Observador getObservador() {
		return this.observador;
	}
	
	public void setObservador(Observador observador) {
		this.observador=observador;
	}
	
	public abstract void notifyObserver(String string);
}
