package com.ejercicio.co.Entities;

public class PredioResidencial extends Predio{
	private float dimension; // EN METROS CUADRADOS
	public static final float MONTO_AVALUO_MENOR = 0.55f;
	public static final float MONTO_AVALUO_MAYOR = 0.85f;
	public static final float LIMITE_DIMENSION = 100.0f;

	
	
	public PredioResidencial() {
		super();
	}



	public PredioResidencial(String registro, String direccion, long montoAvaluo, float dimension) {
		super(registro, direccion, montoAvaluo);
		this.dimension = dimension;
	}

	public float getDimension() {
		return dimension;
	}

	public void setDimension(float dimension) {
		this.dimension = dimension;
	}



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
