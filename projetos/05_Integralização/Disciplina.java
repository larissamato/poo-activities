import java.util.ArrayList;
import java.util.List;

public class Disciplina {

	private int codigo;
	private String descricao;
	private List<Professor> listaProf = new ArrayList<>();
	
	
	public Disciplina(int codigo, String descricao, Professor prof) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.listaProf.add(prof);
	}
	
	public boolean addProfessor(Professor prof) {
		
		if (prof != null && this.listaProf.size() < 10 && !this.listaProf.contains(prof) ) {
			
			this.listaProf.add(prof);
			return true;
		}
		return false ;
	}
	
	public boolean removeProfessor(Professor prof) {
		
		if ( prof != null && this.listaProf.size() > 0  && this.listaProf.contains(prof) ) {
			
			this.listaProf.remove(prof);
			return true;
		}
		return false ;
	}
	
	public List<Professor> getListaProf() {
		return this.listaProf;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
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
		Disciplina other = (Disciplina) obj;
		if (codigo != other.codigo)
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Disciplina [codigo=" + codigo + ", descricao=" + descricao + ", listaProf=" + listaProf + "]";
	}
	
}
