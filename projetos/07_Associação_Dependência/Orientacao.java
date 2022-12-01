
public class Orientacao {

	private Professor orientador = null;
	private Aluno orientando = null;
	private String titulo = null;
			
	public Orientacao(Professor orientador, Aluno orientando, String titulo) {
		
		this.orientador = orientador;
		this.orientador.addOrientacao(this);
		
		this.orientando = orientando;
		this.titulo = titulo;
	}

	public Orientacao(Aluno orientando, String titulo) {
		this.orientando = orientando;
		this.titulo = titulo;
	}

	public Professor getOrientador() {
		return orientador;
	}

	public void setOrientador(Professor orientador) {
		this.orientador = orientador;
	}

	public Aluno getOrientando() {
		return orientando;
	}

	public void setOrientando(Aluno orientando) {
		this.orientando = orientando;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orientador == null) ? 0 : orientador.hashCode());
		result = prime * result + ((orientando == null) ? 0 : orientando.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Orientacao other = (Orientacao) obj;
		if (orientador == null) {
			if (other.orientador != null)
				return false;
		} else if (!orientador.equals(other.orientador))
			return false;
		if (orientando == null) {
			if (other.orientando != null)
				return false;
		} else if (!orientando.equals(other.orientando))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Orientacao [orientador=" + orientador + ", orientando=" + orientando + ", titulo=" + titulo + "]";
	}

}
