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
	
	public boolean checkEmpty() {
		return cabeza == null;
	}
	public <E> void insertarEnCola(E dato) {
		// TODO: Insertar en cola
	}
	/**
	 * @param <E>
	 * @param dato is the value that will be the new head of the list
	 * The method inserts the value given to the head of the list, moving the current head to the next position 
	 * and then modifying the tail next reference to the new head of the list
	 */
	public <E> void insertarEnCabeza(E dato) {
		Nodo nodo = new Nodo(dato);
		//check if the list is currently empty
		if(checkEmpty()) {
			//set the head and the tail as the new node
			cabeza = nodo;
			cola = nodo;
			//set the next node of the head as itself
			nodo.setSiguiente(cabeza);
		}else {
			//Sets the current head as the next value for the new head
			nodo.setSiguiente(cabeza);
			//sets the head as the new node
			cabeza = nodo;
			//sets the next value of the tail as the new head
			cola.setSiguiente(cabeza);
		}
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
