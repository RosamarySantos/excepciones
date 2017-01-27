package teoria;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excepciones5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inFile = new File("/home/profesor/fichero.tx");
		try (FileInputStream in = new FileInputStream(inFile);) {
			int c;
			while ((c = in.read()) != -1 )
				System.out.print((char)c);
		} catch (FileNotFoundException e) {
			System.out.println(inFile + "\nese fichero no existe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error de lectura de disco");
		} 
	}

}
