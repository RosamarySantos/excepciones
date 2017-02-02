package ejercicios;

import java.util.Scanner;

public class TestNumeroBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un número binario:");
		Scanner in = new Scanner(System.in);
		String numero = in.next();
		try {
			NumeroBinario n = new NumeroBinario(numero);
			System.out.printf("%s su valor en decimal es %d%n", n, 
					n.convertirADecimal());
		} catch (BinarioExcepcion e) {
			System.out.println("No es un número binario");
		} finally {
			in.close();
		}
		

	}

}
class BinarioExcepcion extends Exception{}

class NumeroBinario{
	private String valor;

	public NumeroBinario(String valor) throws BinarioExcepcion {
		if ( valor.matches("[01]+") )
			this.valor = valor;
		else
			throw new BinarioExcepcion();
	}
	//método que nos convierta el valor de binario a decimal
	public long convertirADecimal(){
		long decimal = 0;
		StringBuilder sBuilder = new StringBuilder(valor);
		sBuilder.reverse();
		String valorAlReves = sBuilder.toString();
		for (int i = 0; i < valorAlReves.length(); i++) {
			char binario = valorAlReves.charAt(i);
			if ( binario == '1' )
				decimal += Math.pow(2, i);
		}
		return decimal;
	}
	@Override
	public String toString() {
		return valor;
	}
	
	
	
}
	