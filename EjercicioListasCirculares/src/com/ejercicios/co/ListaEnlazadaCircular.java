package com.ejercicios.co;

/**
 * Clase implementación de lista enlazada circular simple
 * La cabeza representa el ultimo nodo añadido o más reciente
 * La cola representa el primer nodo añadido o más viejo
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
	
	public void eliminarCabeza() {
		// TODO: Eliminar Cabeza
	}
	
	public void eliminarCola() {
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
