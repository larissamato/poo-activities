import java.text.ParseException;

public class Professor extends Pessoa {

	private String nome;
	private String depto;
	
	public Professor(String nome, String datanasc, String depto) throws ParseException {
		super(nome, datanasc);
		this.nome = "Msc. " + nome;
		this.depto = depto;
	}

	public String getDepto() {
		return depto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}

	@Override
	public String toString() {
		return "Professor [depto=" + depto 
				       + ", nome(prof)  =" + nome 
				       + ", nome(pessoa)=" + super.nome
				       + ", datanasc=" + sdf.format(datanasc) 
				       + "]";
	}
	
	
	
}
