package com.ejercicio.co.Entities;

public class PredioResidencial extends Predio{
	private float dimension; // EN METROS CUADRADOS
	public static final float MONTO_AVALUO_MENOR = 0.55f;
	public static final float MONTO_AVALUO_MAYOR = 0.85f;
	public static final float LIMITE_DIMENSION = 100.0f;

	
	
	/**Constructor vacio predio residencial
	 * 
	 */
	public PredioResidencial() {
		super();
	}



	/**Constructor con multiplos parametros para el predio residencial.
	 * @param registro
	 * @param direccion
	 * @param montoAvaluo
	 * @param dimension
	 */
	public PredioResidencial(String registro, String direccion, long montoAvaluo, float dimension) {
		super(registro, direccion, montoAvaluo);
		this.dimension = dimension;
	}

	/**Returna la dimension del predio
	 * @return
	 */
	public float getDimension() {
		return dimension;
	}

	/**Setea la direccion del predio
	 * @param dimension
	 */
	public void setDimension(float dimension) {
		this.dimension = dimension;
	}



	/**Calcula la valorizacion del predio
	 * @return el valor de la valorizacion para el predio residencial.
	 */
	@Override
	public long calcularValorizacion() {
		// TODO Auto-generated method stub
		long valor = 0;
		
		if(dimension < LIMITE_DIMENSION) {
			valor = (long) (this.montoAvaluo + this.montoAvaluo*MONTO_AVALUO_MAYOR);
		}else {
			valor = (long) (this.montoAvaluo + this.montoAvaluo*MONTO_AVALUO_MENOR);
		}
		
		return valor;
	}



	@Override
	public String toString() {
		return " Para el predio comercial con registro " + registro +
				"\n Ubicado en la direccion: "+ direccion + 
				"\n con un metraje de: " + dimension + " m2"+  
				"\ny estimando un monto de avaluo correspondiente a: $ " + montoAvaluo + 
				"\nse determina una valorizacion de: $ "+ calcularValorizacion();
	}
	
	

}
