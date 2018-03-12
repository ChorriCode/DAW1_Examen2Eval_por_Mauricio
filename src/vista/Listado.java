package vista;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Listado {
	
	
	//************* objetivo 1 **************

	public static void mostrarAlumnosYNotas(String[] listadoAsignaturas, HashMap<String,ArrayList<String>> listadoAlumnosNotas) {
		int indiceAsig = 0;
		System.out.print("\t\t\t");
		for (int indiceAsignatura = 0; indiceAsignatura < listadoAsignaturas.length; indiceAsignatura++) {
			System.out.print("\t" + listadoAsignaturas[indiceAsignatura]);
			
		}
		//System.out.println();
		for (Entry<String, ArrayList<String>> listadoNotas : listadoAlumnosNotas.entrySet()) {

			System.out.print("\n" + listadoNotas.getKey());
			System.out.print("\t");
			for (String unaNotaDeUnaAsignatura : listadoNotas.getValue()) {
				//La siguiente línea intento controlar un poco los tabuladores para que no me salgan muy descolocados
				//los valoras, lo mejor hubiese sido cambiar la longitud de la palabra MATEMATICAS e HISTORIA pero
				//no he querido tocar los datos originales del exámen, seguro había otra manero pero no se me ocurrio 
				//en este momento
				System.out.print(listadoAsignaturas[indiceAsig].length() >= 8 ? "\t\t" + unaNotaDeUnaAsignatura : "\t   " + unaNotaDeUnaAsignatura);
				indiceAsig++;
			}

			indiceAsig = 0;
		}
	}
	
	
	//************* objetivo 2  **************
	
	public static void notaMediaPorAlumno(HashMap<String,ArrayList<String>> listadoAlumnosNotas) {
		System.out.println("\n*************** NOTAS MEDIA POR ALUMNOS **************");
		for ( Entry<String, ArrayList<String>> alumnosNotas : listadoAlumnosNotas.entrySet()) {
			float notaMedia = 0f;
			float sumaNotas = 0;
			for (int indiceNotas = 0; indiceNotas < alumnosNotas.getValue().size(); indiceNotas++) {
				sumaNotas += Float.parseFloat(alumnosNotas.getValue().get(indiceNotas));			
			}
			System.out.println();
			notaMedia = sumaNotas/alumnosNotas.getValue().size();
			System.out.print("Nota Media del Alumno " + alumnosNotas.getKey() + " es: \t" +  notaMedia);
		}
	}
	
	
	//************* objetivo 3 **************
	
	public static void notaMediaPorAsignatura(String[] listadoAsignaturas, HashMap<String,ArrayList<String>> listadoAlumnosNotas) {
		System.out.println("\n*************** NOTAS MEDIA POR ASIGNATURA **************");
		for (int indiceNotas = 0; indiceNotas < listadoAsignaturas.length; indiceNotas++) {
			float notaMedia = 0f;
			float sumaNotas = 0;
			for ( Entry<String, ArrayList<String>> alumnosNotas : listadoAlumnosNotas.entrySet()) {
				
				sumaNotas += Float.parseFloat(alumnosNotas.getValue().get(indiceNotas));			
			}
			System.out.println();
			notaMedia = sumaNotas/listadoAlumnosNotas.size();
			System.out.print("Nota Media de la Asignatura " + listadoAsignaturas[indiceNotas] + " es:    \t" +  notaMedia);
		}
	}
}
