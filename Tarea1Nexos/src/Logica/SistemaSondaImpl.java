/**
 * 
 */
package Logica;
import Dominio.*;
import ucn.*;
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
		this.listaProgramadores = new ListaProgramadores(100);
	}
	@Override
	public boolean ingresarNovato(String Rut, int SueldoFijo, int Lenguaje) {
		// TODO Auto-generated method stub
		Programador novato = new Novato(Rut,SueldoFijo,Lenguaje);
		boolean ingresarProg = listaProgramadores.ingresarProgramador(novato);
		return ingresarProg;
	}
	@Override
	public boolean ingresarExperto(String Rut, int SueldoFijo, int año) {
		// TODO Auto-generated method stub
		Programador experto = new Experto(Rut, SueldoFijo, año);
		boolean ingresarProg = listaProgramadores.ingresarProgramador(experto);
		return ingresarProg;
	}
	@Override
	public String obtenerDatosProgramadores() {
		// TODO Auto-generated method stub
		String texto = "\nDatos de todos los programadores\n";
		
		for(int i=0;i<listaProgramadores.getCantProg();i++) {
			Programador programador = listaProgramadores.getProgramadorI(i);
			
			if(programador != null ) {
			
				if(programador instanceof Novato) {
					String rut = programador.getRut();
					int sueldo = programador.calcularSueldo();
					int cantidadLenguajes = ( (Novato) programador).getLenguaje();
					texto= texto +" Programador Novato --> Rut : "+rut+", Sueldo: "+sueldo+", Cantidad Lenguajes: "+cantidadLenguajes+"\n";
					
				}else if(programador instanceof Experto) {
					String rut = programador.getRut();
					int sueldo = programador.calcularSueldo();
					int añosExperiencia = ((Experto) programador).getAñosExperiencia();
					texto = texto + " Programador Experto --> Rut : "+rut+", Sueldo: "+sueldo+", Años experiencia: "+añosExperiencia+"\n";
				}
			}
		}
		return texto;
	}
	@Override
	public String obtenerDatosNovatos() {
		// TODO Auto-generated method stub
		String texto = "";
		int CantNovatos =0;
		int sumaLenguajes=0;
		for(int i=0;i<listaProgramadores.getCantProg();i++) {
			Programador programador = listaProgramadores.getProgramadorI(i);
			if(programador != null ) {
				if(programador instanceof Novato) {
					int cantidadLenguajes = ( (Novato) programador).getLenguaje();
					sumaLenguajes+=cantidadLenguajes;
					CantNovatos+=1;		
				}
			}
		}
		double promedio = sumaLenguajes/CantNovatos;
		texto = "La Cantidad de programadores novatos es "+CantNovatos+" y el promedio de lenguajes es "+ promedio;		
		return texto;
	}

}
