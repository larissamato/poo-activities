
public class Conta {
	
	private int numero;
	private String titular;
	private float saldo;

	public Conta (int numero, String titular, float saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
		
	public boolean sacar(float valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;	
		}else {
			return false;
		}
	}
	
	public boolean depositar(float valor) {
		this.saldo = this.saldo + valor;
		return true;
	}
	
	public void imprimir() {
		System.out.println("Conta");
		System.out.println("Numero: " + this.getNumero());
		System.out.println("Titular: " + this.getTitular());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println();

	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
}
