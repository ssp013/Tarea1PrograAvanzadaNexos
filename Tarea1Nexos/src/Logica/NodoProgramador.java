package Logica;
import Dominio.*;

public class NodoProgramador {
	private Programador programador;
	private NodoProgramador next;//próximo nodo en la lista.
	
	public NodoProgramador(Programador p) {
		// TODO Auto-generated constructor stub
		this.programador = p;
		next = null;
	}
	/**
	 * @return the programador
	 */
	public Programador getProgramador() {
		return programador;
	}
	/**
	 * @return the next
	 */
	public NodoProgramador getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(NodoProgramador next) {
		this.next = next;
	}
}
