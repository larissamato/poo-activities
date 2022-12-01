public class Teclado {

	private String marca;
	private String tipo;
	
	public Teclado(String marca) {
		this.marca = marca;
	}
	public Teclado(String marca, String tipo) {
		this.marca = marca;
		this.tipo = tipo;
	}
	
	public String toString() {
		String message = "[ Marca: " + this.marca;
		if(tipo != null ) { message += "; Tipo: " + this.tipo; }
		message += " ]";
		return message;
	}
}
