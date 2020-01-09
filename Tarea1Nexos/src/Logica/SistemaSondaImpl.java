/**
 * 
 */
package Logica;
import Dominio.*;

/**
 * @author ssp013
 *
 */
public class SistemaSondaImpl implements SistemaSonda {
	private ListaProgramadores listaProgramadores;
	/**
	 * 
	 */
	public SistemaSondaImpl() {
		// TODO Auto-generated constructor stub
		this.listaProgramadores = new ListaProgramadores();
	}
	@Override
	public void ingresarNovato(String Rut, int SueldoFijo, int Lenguaje) {
		// TODO Auto-generated method stub
		Programador novato = new Novato(Rut,SueldoFijo,Lenguaje);
		listaProgramadores.insertarPrimer(novato);
	}
	@Override
	public void ingresarExperto(String Rut, int SueldoFijo, int año) {
		// TODO Auto-generated method stub
		Programador experto = new Experto(Rut, SueldoFijo, año);
		listaProgramadores.insertarPrimer(experto);
		
	}
	@Override
	public String obtenerDatosProgramadores() {
		// TODO Auto-generated method stub
		return listaProgramadores.toString();
	}
	@Override
	public String obtenerDatosNovatos() {
		String salida="";
		int CantNovatos =0;
		int sumaLenguajes=0;
		NodoProgramador actual = listaProgramadores.getFirst();
		while(actual!=null) {
			Programador programador = actual.getProgramador();
			if(programador instanceof Novato) {
				int cantidadLenguajes = ((Novato) programador).getLenguaje();
				sumaLenguajes+=cantidadLenguajes;
				CantNovatos+=1;	
				actual = actual.getNext();//Se mueve al próximo Nodo.
			}
		}
		if(CantNovatos>0) {
			double promedio = sumaLenguajes/CantNovatos;			
			salida = salida + "La Cantidad de programadores novatos es "+CantNovatos+" y el promedio de lenguajes es "+ promedio;		
			return salida;
		}else {
			salida = salida + "La Cantidad de programadores novatos es 0 y el promedio de lenguajes es 0";		
			return salida;
		}
	}
}
