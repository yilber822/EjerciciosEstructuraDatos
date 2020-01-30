package com.ejercicio.co.Entities;

public class PredioComercial extends Predio {
	private static final long LIMITE = 20000000;
	private static final float PORCENTAJE_VALORIZACION_MENOR = 10.3f/100f;
	private static final float PORCENTAJE_VALORIZACION_MAYOR = 12.6f/100f;
	
	private long ingresosReportados;
	
	/** Constructor vacio
	 * 
	 */
	public PredioComercial() {
		super();
	}
	
	
	/**Constructor con parametros
	 * @param registro
	 * @param direccion
	 * @param montoAvaluo
	 * @param ingresosReportados
	 */
	public PredioComercial(String registro, String direccion, long montoAvaluo, long ingresosReportados) {
		super(registro, direccion, montoAvaluo);
		this.ingresosReportados = ingresosReportados;
	}


	/**Retorna valores de ingresos reportados
	 * @return el valor de los ingresos reportadoss
	 */
	public long getIngresosReportados() {
		return ingresosReportados;
	}

	/**Setea valores de ingresos reportados
	 * @param ingresosReportados
	 */
	public void setIngresosReportados(long ingresosReportados) {
		this.ingresosReportados = ingresosReportados;
	}

	/**Calcula la valorizacion del predio comercial
	 * @return el valor de la valorizacion para el predio
	 */
	@Override
	public long calcularValorizacion() {
		long valor = 0;
		if(this.ingresosReportados < LIMITE) {
			valor = (long) (this.montoAvaluo+this.montoAvaluo*PORCENTAJE_VALORIZACION_MENOR);
		}else {
			valor = (long) (this.montoAvaluo+this.montoAvaluo*PORCENTAJE_VALORIZACION_MAYOR);
		}
		
		return valor;
	}


	@Override
	public String toString() {
		return "Para el predio comercial con registro " + registro + 
				"\nUbicado en la direccion: "+ direccion + 
				"\ncon ingresos reportados por: $ " + ingresosReportados +   
				"\ny estimando un monto de avaluo correspondiente a: $" + montoAvaluo + 
				"\nse determina una valorizacion de: $"+ calcularValorizacion();
	}
	
	

}
