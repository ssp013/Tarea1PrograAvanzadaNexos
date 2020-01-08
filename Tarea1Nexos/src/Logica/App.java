/**
 * 
 */
package Logica;
import ucn.*;
import java.io.IOException;
import java.util.*;
import java.util.InputMismatchException;
/**
 * @author ssp013
 *
 */
public class App {
	static Scanner sc = new Scanner(System.in);
	public static int validarOpcion(){
	  while (true)
	  {
	   try
	   {
	    return sc.nextInt();
	   }
	   catch (InputMismatchException e)
	   {
	    sc.next();
	    System.out.print("Error: Ingrese nuevamente : ");
	   }
	  }
	}
	public static void desplegarDatosDeLosProgramadores(SistemaSonda Sistema) {
		StdOut.println(Sistema.obtenerDatosProgramadores());
	}
	public static void desplegarDatosNovatos(SistemaSonda Sistema) {
		StdOut.println(Sistema.obtenerDatosNovatos());
	}
	public static void iniciarMenu(SistemaSonda Sistema) {
		StdOut.println("Bienvenido al Sistema Sonda \nIngrese los datos de los programadores.");
		//Verificar Valor Fijo:
		StdOut.println("Ingrese el valor fijo para calcular los sueldo de los programadores: ");
		int SueldoFijo = validarOpcion();
		
		//Preguntamos los datos del programador:
		int cont=1;
		StdOut.println("Ingrese rut programador Nº "+cont+" :");
		String Rut = StdIn.readString();
		//Iniciamos bucle:
		while(!Rut.equals("fin")) {
			StdOut.println("¿Cuál es el nivel de programación? \n Ingrese una opción: \n1)Experto \n2)Novato");
			int nivel = validarOpcion();
			while(nivel != 1 && nivel != 2) {
				StdOut.println("Error! Seleccione 1)Experto o 2)Novato");
				nivel = validarOpcion();
			}
			if(nivel == 1) {
				StdOut.println("Ingrese los años de experiencia del programador "+Rut+" :");
				int año = validarOpcion();
				if(Sistema.ingresarExperto(Rut, SueldoFijo, año)) {
					StdOut.println("Programador ingresado correctamente!");
					cont++;
				}else {
					StdOut.println("Error: Programador ingresado incorrectamente!");
				}
			}else if(nivel==2) {
				StdOut.println("Ingrese la cantidad de lenguajes que ocupa "+Rut+" :");
				int Lenguaje = validarOpcion();
				if(Sistema.ingresarNovato(Rut, SueldoFijo, Lenguaje)) {
					StdOut.println("Programador ingresado correctamente!");
					cont++;
				}else {
					StdOut.println("Error: Programador ingresado incorrectamente!");		
				}
			}
			StdOut.println("Ingrese rut programador Nº "+cont+" :");
			Rut = StdIn.readString();
		}
		StdOut.println("Fin de ingreso de datos!");
		//Desplegamos los datos de los programadores:
		desplegarDatosDeLosProgramadores(Sistema);
		desplegarDatosNovatos(Sistema);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SistemaSonda Sistema = new SistemaSondaImpl();
		iniciarMenu(Sistema);
	}
}
