package ejercicios;

public class TestTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Triangulo t = new Triangulo(1, 1 , 1);
			System.out.println(t);
		} catch (IlegalTrianguloExcepcion e) {
			// TODO Auto-generated catch block
			System.out.println("No es un triangulo");;
		}

	}

}
class IlegalTrianguloExcepcion extends Exception {}

class Triangulo{
	private int lado1;
	private int lado2;
	private int lado3;
	public Triangulo(int lado1, int lado2, int lado3)
			throws IlegalTrianguloExcepcion {
		if ( lado1 + lado2 > lado3 && lado1 + lado3 > lado2 
				&& lado2 + lado3 > lado1 ){
			this.lado1 = lado1;
			this.lado2 = lado2;
			this.lado3 = lado3;
		}
		else
			throw new IlegalTrianguloExcepcion();
	}
	@Override
	public String toString() {
		return "Triangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + "]";
	}
	

}