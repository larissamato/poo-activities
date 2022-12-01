
public class Program2 {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario("Eliezer", 10000.00f);
		Chefe chf = new Chefe("Dory", 10000.00f, 3000.00f);
		
		System.out.println( f.toString() );
		System.out.println( chf.toString() );
		
		System.out.println( f.nome + ": "+ f.salarioLiquido() );
		System.out.println( chf.nome + ": "+ chf.salarioLiquido() );
		
	}

}
