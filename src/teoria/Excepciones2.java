package teoria;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Excepciones2 {

	public static void main(String[] args) {
		// Excepeciones declarativas
		try {
			URL url = new URL("http://www.google.es");
			InputStream inStream = url.openStream();
			BufferedReader in = new BufferedReader(
					new InputStreamReader(inStream));
			String linea="";
			while ((linea = in.readLine()) != null){
				System.out.println(linea);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println("Esa URL esta mal formada");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error I/O");
		}

	}

}
