package com.ejercicio.co;

public class PredioComercial extends Predio {
	private static final long LIMITE = 20000000;
	private static final float PORCENTAJE_VALORIZACION_MENOR = 10.3f/100f;
	private static final float PORCENTAJE_VALORIZACION_MAYOR = 12.6f/100f;
	
	private long ingresosReportados;
	public PredioComercial() {
		super();
	}
	
	
	public PredioComercial(String registro, String direccion, long montoAvaluo, long ingresosReportados) {
		super(registro, direccion, montoAvaluo);
		this.ingresosReportados = ingresosReportados;
	}


	public long getIngresosReportados() {
		return ingresosReportados;
	}

	public void setIngresosReportados(long ingresosReportados) {
		this.ingresosReportados = ingresosReportados;
	}

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
		return "PredioComercial [ingresosReportados=" + ingresosReportados + ", registro=" + registro + ", direccion="
				+ direccion + ", montoAvaluo=" + montoAvaluo + "]";
	}
	
	

}
