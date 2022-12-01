
public class Program {

	public static void main(String[] args) {
		
		Produto p1 = new Produto(1, 3000.00f, "Computador");
		Produto p2 = new Produto(2, 1000.00f, "Celular");
		
		NotaFiscal nf1 = new NotaFiscal();
		
		nf1.addItem(2, p1);
		nf1.addItem(3, p2);
		
		System.out.println( nf1 );
	}

}
