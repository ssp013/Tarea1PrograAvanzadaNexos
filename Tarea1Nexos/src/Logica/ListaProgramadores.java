/**
 * 
 */
package Logica;
import Dominio.*;

/**
 * @author ssp013
 *
 */
public class ListaProgramadores {
	private NodoProgramador first;//first, es referente al primer nodo de la lista.
	public ListaProgramadores() {//Constructor
		first = null;//No hay nodos en la lista toavía.
	}
	public void insertarPrimer(Programador p) {
		NodoProgramador newNodo = new NodoProgramador(p);//Creamos un nuevo NODO.
		newNodo.setNext(first);//apunta al antiguo
		first = newNodo;//ahora el nuevo Nodo queda como First.
	}
	public NodoProgramador getFirst() {
		return first;
	}
	@Override
	public String toString() {
		String salida="";
		NodoProgramador actual = first;
		while(actual!=null) {
			Programador programador = actual.getProgramador();
			if(programador instanceof Novato) {
				String rut = programador.getRut();
				int sueldo = programador.calcularSueldo();
				int cantidadLenguajes = ((Novato) programador).getLenguaje();
				salida= salida +" Programador Novato --> Rut : "+rut+", Sueldo: "+sueldo+", Cantidad Lenguajes: "+cantidadLenguajes+"\n";
				actual = actual.getNext();//Se mueve al próximo Nodo.
			}else if(programador instanceof Experto) {
				String rut = programador.getRut();
				int sueldo = programador.calcularSueldo();
				int añosExp = ((Experto) programador).getAñosExperiencia();
				salida = salida + " Programador Experto --> Rut : "+rut+", Sueldo: "+sueldo+", Años experiencia: "+añosExp+"\n";
				actual = actual.getNext();
			}
		}
		return salida;
	}
}
