package teoria;

public class TrianguloRectanguloNew {
	//atributos: dos catetos y la hipotenusa
	private double cateto1;
	private double cateto2;
	private double hipotenusa;
	public TrianguloRectanguloNew(double cateto1, double cateto2, double hipotenusa) {
		//Si cumple el teorema de pitágoras inicializamos
		//los atributos:
		if (Math.pow(cateto1,2) + Math.pow(cateto2,2) ==
				Math.pow(hipotenusa, 2)){
			this.cateto1 = cateto1;
			this.cateto2 = cateto2;
			this.hipotenusa = hipotenusa;
		}
		//en caso contrario lanzamos la excepción
		//TrianguloRectanguloException
		else
			throw new RuntimeException();
	}
	@Override
	public String toString() {
		return "TrianguloRectangulo [cateto1=" + cateto1 + ", cateto2=" + cateto2 + ", hipotenusa=" + hipotenusa + "]";
	}
	
}
