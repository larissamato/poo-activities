
public class Carro {

	private String marca;
	private String modelo;
	private boolean ligado = false;
	private boolean andando = false;
	private int velocidade = 0;

	public Carro(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isLigado() {
		return ligado;
	}

	
	public boolean isAndando() {
		return andando;
	}

	public void ligarCarro(Chave chave) {
		if (chave == null) {
			System.out.println("A chave não pode ser nula !");
		}
		else {
			this.ligado = true;
			System.out.println("Carro ligado");
		}
	}

	public void desligarCarro(Chave chave) {
		if (chave == null) {
			System.out.println("A chave não pode ser nula !");
		}
		else {
			this.ligado = false;
			System.out.println("Carro desligado");
		}
	}
	public void acelerarCarro() {
		if (isLigado()) {
			this.velocidade += 10;
			this.andando = true;
		}
	}
	
	public void reduzirCarro() {
		if (isLigado() && this.velocidade > 0) {
			this.velocidade -= 10;
		}
		if (velocidade == 0) {
			this.andando = false;
		}
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", ligado=" + ligado + ", andando=" + andando
				+ ", velocidade=" + velocidade + "]";
	}	
	
}
