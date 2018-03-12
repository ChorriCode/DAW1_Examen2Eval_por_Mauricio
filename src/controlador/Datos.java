package controlador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Datos {

	
	public String[] leerFicheroTxtConAsignaturas(String rutaFichero) {
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
	
	
}
