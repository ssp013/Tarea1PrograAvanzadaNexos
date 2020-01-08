/**
 * 
 */
package Logica;
import Dominio.Programador;

/**
 * @author ssp013
 *
 */
public class ListaProgramadores {

	/**
	 * 
	 */
	private Programador [] Lp;
	private int cant;
	private int max;
	public ListaProgramadores(int max) {
		// TODO Auto-generated constructor stub
		Lp = new Programador [max];
		cant = 0;
		this.max = max;
	}
	public boolean ingresarProgramador(Programador programador) {
		boolean resp = false;
		if(cant<max) {
			Lp[cant]= programador;
			cant++;
			resp=true;
		}
		return resp;
	}
	public Programador buscarProgramador(String Rut) {
		int k;
		for(k=0;k<max;k++) {
			if(Lp[k].getRut().equals(Rut)) {
				break;
			}
		}
		if(k==max) {
			return null;
		}else {
			return Lp[k];
		}
	}
	public int getCantProg() {
		return cant;
	}
	public Programador getProgramadorI(int i) {
		if(i>=0 && i<cant) {
			return Lp[i];
		}else {
			return null;
		}
	}

}
