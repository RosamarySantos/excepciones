package teoria;

import java.util.Scanner;

public class TestTrianguloRectanguloNew {

	public static void main(String[] args) {
		System.out.println("Introduce los lados del "
				+ "triangulo rectángulo en el orden catetos "
				+ "y posteriormente la hipotenusa");
		Scanner in = new Scanner(System.in);
		double cateto1 = in.nextDouble();
		double cateto2 = in.nextDouble();
		double hipotenusa = in.nextDouble();
		if ((Math.pow(cateto1,2) + Math.pow(cateto2,2) ==
					Math.pow(hipotenusa, 2))){
			TrianguloRectanguloNew t = new TrianguloRectanguloNew(
						cateto1, cateto2, hipotenusa);
			System.out.println(t);
		}
		else
			System.out.println("No se puede crear triangulo rectangulo");
		

	}

}
