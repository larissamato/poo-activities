import java.util.ArrayList;
import java.util.List;

public class Professor {

	private String nome;
	private List<Orientacao> listaOrientacao = new ArrayList<>();
	

	public Professor(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Orientacao> getListaOrientacao() {
		return listaOrientacao;
	}

	public boolean addOrientacao(Orientacao orientacao) {
		if (orientacao != null && !listaOrientacao.contains(orientacao)) {
			this.listaOrientacao.add(orientacao);
			orientacao.setOrientador(this);
			return true;
		}
		return false;
	}
	
	public boolean removerOrientacao(Orientacao orientacao) {
		if (orientacao != null && listaOrientacao.contains(orientacao)) {
			this.listaOrientacao.remove(orientacao);
			orientacao.setOrientador(null);
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Professor [nome=" + nome + "]";
	}
	
}
