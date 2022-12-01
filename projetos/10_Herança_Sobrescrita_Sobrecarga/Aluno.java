import java.text.ParseException;

public class Aluno extends Pessoa {

	private String curso;
	
	public Aluno(String nome, String datanasc, String curso) throws ParseException {
		super(nome, datanasc);
		this.curso = curso;		
	}

	@Override
	public String toString() {
		return "Aluno [curso=" + curso 
				   + ", nome=" + nome + ", "
				 + "datanasc=" + sdf.format(datanasc) + "]";
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
