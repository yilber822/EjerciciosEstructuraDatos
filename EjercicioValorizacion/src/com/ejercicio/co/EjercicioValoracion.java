package com.ejercicio.co;

import com.ejercicio.co.Entities.Predio;
import com.ejercicio.co.Entities.PredioComercial;
import com.ejercicio.co.GUI.MainMenu;

import javax.swing.JOptionPane;

public class EjercicioValoracion {

	public static void main(String[] args) {
		String registro = "";
		String direccion = "";
		long montoAvaluo = 0L;
		int opcionEntrada = 0;
		
		Predio predio;

		MainMenu menu = new MainMenu();
		menu.setVisible(true);
		do {
			String msg = "Eliga la opción correspondiente al tipo de predio\n"
						 +"1. Predio residencial.\n"
						 +"2. Predio comercial.\n"
						 +"3. Salir.\n";
			opcionEntrada = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
			
			switch (opcionEntrada) {
			case 1: 
				// Residencial
				break;
			case 2: 
				// Comercial con constructors vacio
				predio = new PredioComercial();
				registro = JOptionPane.showInputDialog(null, "Digite el valor del registro del predio");
				direccion = JOptionPane.showInputDialog(null, "Digite la direccion del predio con registro "+registro);
				montoAvaluo = Long.parseLong(JOptionPane.showInputDialog(null, "Digite el valor del avaluo para el predio "+registro));
				long ingresosReportados = Long.parseLong(JOptionPane.showInputDialog(null, "Digite el valor de los ingresos del predio "+registro));
				
				predio.setRegistro(registro);
				predio.setDireccion(direccion);
				predio.setMontoAvaluo(montoAvaluo);
				// Downcast
				((PredioComercial)predio).setIngresosReportados(ingresosReportados);
				// El metodo de predio calcularValorizacion se comporta de forma polimorfica porque de acuerdo a su contexto 
				// o clase especifica puede retornar diferentes valores
				String predioMsg = ((PredioComercial)predio).toString()+"\nValorizado en "+((PredioComercial)predio).calcularValorizacion();
				JOptionPane.showMessageDialog(null, predioMsg);
				break;
			
			case 3:
				opcionEntrada = 0;
				break;
				
			}
		}while(opcionEntrada!=0);
	}

}
