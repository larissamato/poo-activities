
public class TesteAutor {

	public static void main(String[] args) {
		
		Livro l1 = new Livro("Aprendendo Java v.1");
		
		Livro l2 = new Livro("Aprendendo Java v.2");
		
		Livro l3 = new Livro("Dominando Java");
		
		Autor a1 = new Autor("João", "Masculino", l1);
		
		System.out.println(a1.toString());
		
		a1.add_livro(l2);
		
		System.out.println(a1.toString());
		
		
		
		boolean resp1 = a1.remover_livro(l3);
		
		System.out.println("O livro l3 foi removido do a1 ? " + resp1);
		
		
		
		boolean resp2 = a1.remover_livro(l2);
		
		System.out.println("O livro l2 foi removido do a1 ? " + resp2);
		
		System.out.println(a1.toString());
		
		
		
		boolean resp3 = a1.remover_livro(l3);
		
		System.out.println("O livro l3 foi removido do a1 ? " + resp3);
		
		System.out.println(a1);
	}

}
