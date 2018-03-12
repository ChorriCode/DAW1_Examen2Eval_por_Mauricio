package vista;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Listado {

	public static void mostrarAlumnosYNotas(String[] listadoAsignaturas, HashMap<String,ArrayList<String>> listadoAlumnosNotas) {
		
		System.out.print("\t\t");
		for (int indiceAsignatura = 0; indiceAsignatura < listadoAsignaturas.length; indiceAsignatura++) {
			System.out.print("\t" + listadoAsignaturas[indiceAsignatura]);
		}
		System.out.println();
		for (Entry<String, ArrayList<String>> listadoNotas : listadoAlumnosNotas.entrySet()) {
			System.out.println("\n" + listadoNotas.getKey());
			System.out.print("\t\t");
			for (String unaNotaDeUnaAsignatura : listadoNotas.getValue()) {
				System.out.print("\t" + unaNotaDeUnaAsignatura);
			}

		}
	}
	
	public static void notaMediaPorAlumno(HashMap<String,ArrayList<String>> listadoAlumnosNotas) {
		
		for ( Entry<String, ArrayList<String>> alumnosNotas : listadoAlumnosNotas.entrySet()) {
			float notaMedia = 0f;
			float sumaNotas = 0;
			for (int indiceNotas = 0; indiceNotas < alumnosNotas.getValue().size(); indiceNotas++) {

				sumaNotas += Float.parseFloat(alumnosNotas.getValue().get(indiceNotas));
				
			}
			System.out.println();
			System.out.println(sumaNotas);
			notaMedia = sumaNotas/alumnosNotas.getValue().size();
			System.out.println(notaMedia);
		}
	}
}
