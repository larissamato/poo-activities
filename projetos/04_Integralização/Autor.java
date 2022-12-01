import java.util.ArrayList;
import java.util.List;

public class Autor {

	private String nome;
	private String sexo;
	private List<Livro> livros = new ArrayList<>();
	
	public Autor(String nome, String sexo, Livro l) {
		this.nome = nome;
		this.sexo = sexo;
		this.adicionarLivro(l);
	}
	
	public void adicionarLivro(Livro l) {
		if ( !livros.contains(l) ) {
			this.livros.add(l);	
		}
	}
	
	public void removerLivro(Livro l) {
		if ( livros.contains(l) && livros.size() > 1 ) {
			this.livros.remove(l);
		}
	}

	public int qtdeLivros() {
		return this.livros.size();
	}
	
	public void listarLivros() {
		Livro aux = null;
		System.out.println("Lista de Livros");
		for (int i=0; i<livros.size(); i++) {
			aux = livros.get(i);
			System.out.println( i+1 + " -  Nome: " + aux.getTitulo());
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Autor [nome=" + this.nome + ", sexo=" + this.sexo + "]";
	}
	
}
