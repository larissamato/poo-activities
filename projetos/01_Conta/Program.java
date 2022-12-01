
public class Program {

	public static void main(String[] args) {
		
		Conta a = new Conta(1, "Dory", 1000.0f);
		
		Conta b = new Conta(2, "Carol", 3500.0f);

		b.sacar(500);
		
		a.depositar(500);
				
		a.imprimir();
		
		b.imprimir();
	}
}
