package com.ejercicios.co;

public class EjercicioListas {

	public static void main(String[] args) {
		// TODO: Usar listas con JOptionPane o lo que se proponga. dynamic UI ok no.
		ListaEnlazadaCircular circular = new ListaEnlazadaCircular();
		circular.insertarEnCola("Hola que hace");
		circular.insertarEnCola(666);
		circular.insertarEnCola(5656.6565f);
		System.out.println(circular);
	}

}
