/**
 * 
 */
package Dominio;

/**
 * @author ssp013
 *
 */
public abstract class  Programador {

	/**
	 * 
	 */
	private String Rut;
	private int SueldoFijo;
	
	public Programador(String Rut, int SueldoFijo) {
		// TODO Auto-generated constructor stub
		this.Rut=Rut;
		this.SueldoFijo=SueldoFijo;
	}

	/**
	 * @return the rut
	 */
	public String getRut() {
		return Rut;
	}

	/**
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		Rut = rut;
	}

	/**
	 * @return the sueldoFijo
	 */
	public int getSueldoFijo() {
		return SueldoFijo;
	}

	/**
	 * @param sueldoFijo the sueldoFijo to set
	 */
	public void setSueldoFijo(int sueldoFijo) {
		SueldoFijo = sueldoFijo;
	}
	abstract public int calcularSueldo();
}
