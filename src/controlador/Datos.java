package controlador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Datos {

	//************* necesario para cumplir los objetivos 1 y 3 **************
	
	public static String[] leerFicheroTxtConAsignaturas(String rutaFichero) {
		String[] listaAsignaturas = null;
		try {
			FileReader fr = new FileReader(rutaFichero);
			BufferedReader br = new BufferedReader(fr);
			listaAsignaturas = br.readLine().split(",");		
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaAsignaturas;
	}
	
	//************* necesario para cumplir los 3 objetivos **************
	
	public static HashMap<String,ArrayList<String>> leerFicheroAlumnosNotas(String rutaFichero){
		HashMap<String,ArrayList<String>> resultado = new HashMap<String,ArrayList<String>>();
		try {
			FileReader fr = new FileReader(rutaFichero);
			BufferedReader br = new BufferedReader(fr);
			String strLine;

			while ((strLine = br.readLine()) != null) {
				String[] datos = strLine.split("#");
				String nombreAlumno = datos[0];
				String[] notasAlumno = datos[1].split(",");
				ArrayList<String> listadoNotas = new ArrayList<String>();
				for (int indiceNotas = 0; indiceNotas < notasAlumno.length; indiceNotas++) {				
					listadoNotas.add(notasAlumno[indiceNotas]);
					resultado.put(nombreAlumno, listadoNotas);
				}
				
			}

			fr.close();
			br.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
		return resultado;
	}
}
