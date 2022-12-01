
public class Program {

	public static void main(String[] args) {
		
		Livro l1 = new Livro("O bem amado","Romance");
		Livro l2 = new Livro("Diário de um banana","Autoajuda");
		Livro l3 = new Livro("Java Legal","Autoajuda");
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		System.out.println(l3.toString());
		System.out.println();				
		Autor a1 = new Autor("Carol", "Feminino", l1);
		Autor a2 = new Autor("Dory", "Masculino", l2);
		
		a1.adicionarLivro(l3);
		
		System.out.println(a1.toString() + " Qtde Livros: " + a1.qtdeLivros());
		a1.listarLivros();
		
		System.out.println();
		System.out.println( a2.toString() + " Qtde Livros: " + a2.qtdeLivros());
		a2.listarLivros();
		
		
	}

}
