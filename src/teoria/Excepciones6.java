package teoria;
//no debemos trabajar las RuntimeException
//con bloques try/catch
//mejor comprobar que la división no es por cero
public class Excepciones6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int numerador  = 100;
		int denominador = 0;
		try{
			double division = numerador / denominador;
			System.out.println(division);
		} catch (ArithmeticException e){
			System.out.println("División por cero");
		}
	}

}
