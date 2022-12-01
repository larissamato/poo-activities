public class TesteEstante {

	public static void main(String[] args) {
				
		Livro lv1 = new Livro("Programação Java", "Dory", "Câmpus");
		Livro lv2 = new Livro("UML e Padrões", "Larman", "Bookman");
		Livro lv3 = new Livro("Php", "Deitel", "Pearson");
		Livro lv4 = new Livro("Java", "Barnes", "Pearson");
		
		Estante e = new Estante("AB-123");
		
		e.addLivro(lv1);
		e.addLivro(lv2);
		e.addLivro(lv3);
		e.addLivro(lv4);
		System.out.println(e);
		
		e.removerLivro(lv1);
		e.addLivro(lv4);
		System.out.println(e);		
	}	
}



