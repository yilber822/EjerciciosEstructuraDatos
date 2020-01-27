package com.ejercicio.co.Entities;

public abstract class Predio {
	protected String registro;
	protected String direccion;
	protected long montoAvaluo;
	
	// region Constructors
	public Predio() {
		
	}
	
	public Predio(String registro, String direccion, long montoAvaluo) {
		this.registro = registro;
		this.direccion = direccion;
		this.montoAvaluo = montoAvaluo;
	}
	
	// endregion
	
	// region Getters and Setters

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public long getMontoAvaluo() {
		return montoAvaluo;
	}

	public void setMontoAvaluo(long montoAvaluo) {
		this.montoAvaluo = montoAvaluo;
	}
	
	// endregion
	
	// region Methods
	public abstract long calcularValorizacion();
	// endregion

}
