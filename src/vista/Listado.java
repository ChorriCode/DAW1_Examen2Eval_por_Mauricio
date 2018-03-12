package vista;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Listado {

	public static void mostrarAlumnosYNotas(String[] listadoAsignaturas, HashMap<String,ArrayList<String>> listadoAlumnosNotas) {
		
		
		for (Entry<String, ArrayList<String>> listadoNotas : listadoAlumnosNotas.entrySet()) {
			for (String unaNotaDeUnaAsignatura : listadoNotas.getValue()) {
				System.out.println(listadoNotas.getKey() + " - " + unaNotaDeUnaAsignatura);
			}
		}
	}
}
