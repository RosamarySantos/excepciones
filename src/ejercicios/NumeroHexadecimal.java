package ejercicios;

public class NumeroHexadecimal {
	private String valor;

	public NumeroHexadecimal(String valor) throws HexadecimalException {
		if ( valor.matches("[0-9a-fA-F]+"))
			this.valor = valor;
		else
			throw new HexadecimalException();
	}
	public long obtenerValorEnDecimal(){
		return Long.parseLong(valor, 16);
	}
	@Override
	public String toString() {
		return valor;
	}
	

}
