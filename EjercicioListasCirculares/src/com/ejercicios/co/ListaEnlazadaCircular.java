package com.ejercicios.co;

/**
 * Clase implementación de lista enlazada circular simple, con metodos
 * de inserción por cola y cabeza. De esta forma se comporta como una dequeue
 * o cola de doble final dependiendo del tipo de operacion que se realice con la
 * cola o cabeza
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
	
	/**
	 * Appends an element by shifting the tail, so the new element will be the tail
	 * O(9)~O(1) the insertion takes constant time, because we just update pointers
	 * @param <E>
	 * @param dato
	 */
	public <E> void insertarEnCola(E dato) {
		Nodo nodo = new Nodo(dato);
		if(!checkEmpty()) {
			// If the list is not empty, the head is updated to point to the new node
			this.cabeza.setSiguiente(nodo);
			// The new node is linked to the tail to keep it circular
			nodo.setSiguiente(this.cola);
			// The tails is updated
			this.cola = nodo;
		}else {
			// If the list is empty, Just set the tail and head and make it circular
			this.cabeza = nodo;
			this.cola = nodo;
			this.cabeza.setSiguiente(cola);
		}
		this.cantidad++;
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
		this.cantidad++;
	}
	
	public void eliminarCabeza() {
		// TODO: Eliminar Cabeza y disminuir cantidad
	}
	
	public void eliminarCola() {
		// TODO: Elimar cola y disminuir cantidad
	}
	
	public <E> void eliminarElemento(E dato) {
		// TODO: Eliminarlo  y disminuir cantidad
	}
	
	public <E> boolean buscarElemento(E dato) {
		boolean encontrado = false;
		// TODO: Buscarlo y cambiar valor
		return encontrado;
	}

	@Override
	public String toString() {
		return "ListaEnlazadaCircular [cabeza=" + cabeza + ", cola=" + cola + ", cantidad=" + cantidad + "]";
	}

	
}
