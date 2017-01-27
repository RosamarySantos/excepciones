package teoria;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//programa que lee un fichero
public class Excepciones4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inFile = new File("/home/profesor/fichero.tx");
		FileInputStream in = null;
		try {
			in = new FileInputStream(inFile);
			int c;
			while ((c = in.read()) != -1 )
				System.out.print((char)c);
		} catch (FileNotFoundException e) {
			System.out.println(inFile + "\nese fichero no existe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error de lectura de disco");
		} finally {
			System.out.println("Cerrando flujos");
			try {
				if (in != null) in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
