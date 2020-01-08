/**
 * 
 */
package Logica;

/**
 * @author ssp013
 *
 */
public interface SistemaSonda {
	public boolean ingresarNovato(String Rut,int SueldoFijo,int Lenguaje);
	public boolean ingresarExperto(String Rut, int SueldoFijo, int año);
	public String obtenerDatosProgramadores();
	public String obtenerDatosNovatos();
}
