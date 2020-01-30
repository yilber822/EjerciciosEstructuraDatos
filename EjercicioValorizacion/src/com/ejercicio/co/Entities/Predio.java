package com.ejercicio.co.Entities;

public abstract class Predio {
	protected String registro;
	protected String direccion;
	protected long montoAvaluo;
	
	// region Constructors
	/**Constructor vacio para el predio
	 * 
	 */
	public Predio() {
		
	}
	
	/**Constructor con multiplos parametros
	 * @param registro
	 * @param direccion
	 * @param montoAvaluo
	 */
	public Predio(String registro, String direccion, long montoAvaluo) {
		this.registro = registro;
		this.direccion = direccion;
		this.montoAvaluo = montoAvaluo;
	}
	
	// endregion
	
	// region Getters and Setters

	/**Retirna el valor del registro
	 * @return
	 */
	public String getRegistro() {
		return registro;
	}

	/**Establece el valor del registro
	 * @param registro
	 */
	public void setRegistro(String registro) {
		this.registro = registro;
	}

	/**Retorna la direccion del predio
	 * @return
	 */
	public String getDireccion() {
		return direccion;
	}

	/**Establece la direccion del predio
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**Obtiene el monto del avaluo
	 * @return
	 */
	public long getMontoAvaluo() {
		return montoAvaluo;
	}

	/**Establece el monto del avaluo
	 * @param montoAvaluo
	 */
	public void setMontoAvaluo(long montoAvaluo) {
		this.montoAvaluo = montoAvaluo;
	}
	
	// endregion
	
	// region Methods
	public abstract long calcularValorizacion();
	// endregion

}
