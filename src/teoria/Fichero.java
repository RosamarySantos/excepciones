package teoria;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

public class Fichero {
	private String rutaFichero;

	public Fichero(String rutaFichero) {
		this.rutaFichero = rutaFichero;
	}
	public String obtenerContenidoFichero()
			throws IOException{
		String contenido = "";
		//primero creo el descriptor
		File inFile = new File(rutaFichero);
		//segundo creo el flujo datos
		FileInputStream in = new FileInputStream(inFile);
		int c;
		while ((c = in.read()) != -1)
			contenido += (char)c;
		in.close();
		return contenido;
	}
}
