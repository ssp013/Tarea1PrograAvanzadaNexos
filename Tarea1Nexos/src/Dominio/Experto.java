/**
 * 
 */
package Dominio;

/**
 * @author ssp013
 *
 */
public class Experto extends Programador{

	/**
	 * 
	 */
	private int añosExperiencia;
	public Experto(String Rut, int SueldoFijo, int añosExperiencia) {
		// TODO Auto-generated constructor stub
		super(Rut, SueldoFijo);
		this.añosExperiencia = añosExperiencia;
	}
	
	/**
	 * @return the añosExperiencia
	 */
	public int getAñosExperiencia() {
		return añosExperiencia;
	}

	/**
	 * @param añosExperiencia the añosExperiencia to set
	 */
	public void setAñosExperiencia(int añosExperiencia) {
		this.añosExperiencia = añosExperiencia;
	}

	@Override
	public int calcularSueldo() {
		// TODO Auto-generated method stub
		int monto = 250000;
		int sueldo = this.añosExperiencia*monto;
		int montoFinal = sueldo + this.getSueldoFijo();
		return montoFinal;
	}

	@Override
	public String toString() {
		return "Programador Experto [ añosExperiencia = " + añosExperiencia + "]";
	}
	

}
