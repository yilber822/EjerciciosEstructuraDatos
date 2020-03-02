package com.ejercicios.co;

/**
 * Clase implementaci�n de lista enlazada circular simple
 * La cabeza representa el ultimo nodo a�adido o m�s reciente
 * La cola representa el primer nodo a�adido o m�s viejo
 * De esta forma, la cabeza siempre tendra su puntero siguiente igual a la cola
 * para formar el ciculo
 */
public class ListaEnlazadaCircular {
	private Nodo cabeza;
	private Nodo cola;
	private int cantidad; 
	
	public ListaEnlazadaCircular() {
		cabeza = null;
		cola = null;
		cantidad = 0;
	}
	
	public <E> void insertarEnCola(E dato) {
		// TODO: Insertar en cola
	}
	
	public <E> void insertarEnCabeza(E dato) {
		// TODO: Insertar en cabeza
	}
	
	public <E> void eliminarCabeza() {
		// TODO: Eliminar Cabeza
	}
	
	public <E> void eliminarCola() {
		// TODO: Elimar cola
	}
	
	public <E> void eliminarElemento(E dato) {
		// TODO: Eliminarlo 
	}
	
	public <E> boolean buscarElemento(E dato) {
		boolean encontrado = false;
		// TODO: Buscarlo y cambiar valor
		return encontrado;
	}

	
	
	
}
