/**
 * 
 */
package Dominio;

/**
 * @author ssp013
 *
 */
public class Novato extends Programador{

	/**
	 * 
	 */
	private int Lenguaje;
	public Novato(String Rut, int SueldoFijo,int Lenguaje) {
		// TODO Auto-generated constructor stub
		super (Rut,SueldoFijo);
		this.Lenguaje = Lenguaje;
	}
	

	/**
	 * @return the lenguaje
	 */
	public int getLenguaje() {
		return Lenguaje;
	}


	/**
	 * @param lenguaje the lenguaje to set
	 */
	public void setLenguaje(int lenguaje) {
		Lenguaje = lenguaje;
	}


	@Override
	public int calcularSueldo() {
		// TODO Auto-generated method stub
		return this.getSueldoFijo();
	}


	@Override
	public String toString() {
		return "Programador Novato [ Cantidad de Lenguaje = " + Lenguaje + "]";
	}
	

}
