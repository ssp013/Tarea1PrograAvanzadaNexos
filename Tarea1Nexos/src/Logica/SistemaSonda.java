/**
 * 
 */
package Logica;

/**
 * @author ssp013
 *
 */
public interface SistemaSonda {
	public void ingresarNovato(String Rut,int SueldoFijo,int Lenguaje);
	public void ingresarExperto(String Rut, int SueldoFijo, int año);
	public String obtenerDatosProgramadores();
	public String obtenerDatosNovatos();
}
