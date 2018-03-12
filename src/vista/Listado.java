package vista;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Listado {

	public static void mostrarAlumnosYNotas(String[] listadoAsignaturas, HashMap<String,ArrayList<String>> listadoAlumnosNotas) {
		int indiceAsig;
		System.out.print("\t\t\t");
		for (int indiceAsignatura = 0; indiceAsignatura < listadoAsignaturas.length; indiceAsignatura++) {
			System.out.print("\t" + listadoAsignaturas[indiceAsignatura]);
			
		}
		//System.out.println();
		for (Entry<String, ArrayList<String>> listadoNotas : listadoAlumnosNotas.entrySet()) {
			indiceAsig = 0;
			System.out.print("\n" + listadoNotas.getKey());
			System.out.print("\t");
			for (String unaNotaDeUnaAsignatura : listadoNotas.getValue()) {
				
				System.out.print(listadoAsignaturas[indiceAsig].length() > 6 ? "\t\t" + unaNotaDeUnaAsignatura : "\t" + unaNotaDeUnaAsignatura);
			}

		}
	}
	
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
