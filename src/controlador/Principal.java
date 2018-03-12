package controlador;

import java.util.ArrayList;
import java.util.HashMap;

import vista.Listado;

public class Principal {

	public static void main(String[] args) {
		
		String[] listadoAsignaturas = Datos.leerFicheroTxtConAsignaturas("ficheros/asignaturas.txt");
		HashMap<String, ArrayList<String>> listadoAlumnosNotas = Datos.leerFicheroAlumnosNotas("ficheros/notasAlumnos.txt");
		Listado.mostrarAlumnosYNotas(listadoAsignaturas, listadoAlumnosNotas);
		
		Listado.notaMediaPorAlumno(listadoAlumnosNotas);
	}

}
