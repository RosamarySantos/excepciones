package teoria;

import java.io.IOException;

//comprobar el funcionamiento de la clase Fichero
public class TestFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fichero fichero = new Fichero("/home/profesor/fichero.txt");
		try {
			String contenidoFichero = fichero.obtenerContenidoFichero();
			System.out.println(contenidoFichero);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error de entrada/salida");
		}

	}

}
