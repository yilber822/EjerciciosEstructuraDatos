package com.ejercicio.co;

public class PredioComercial extends Predio {
	private long ingresosReportados;
	private static final long LIMITE = 20000000;
	private static final float PORCENTAJE_VALORIZACION_MENOR = 10.3f;
	private static final float PORCENTAJE_VALORIZACION_MAYOR = 12.6f;
	public PredioComercial() {
		
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
			valor = this.montoAvaluo*(long)PORCENTAJE_VALORIZACION_MENOR;
		}else {
			valor = this.montoAvaluo*(long)PORCENTAJE_VALORIZACION_MAYOR;
		}
		
		return valor;
	}


	@Override
	public String toString() {
		return "PredioComercial [ingresosReportados=" + ingresosReportados + ", registro=" + registro + ", direccion="
				+ direccion + ", montoAvaluo=" + montoAvaluo + "]";
	}
	
	

}
