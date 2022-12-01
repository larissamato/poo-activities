import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Pessoa {
	
	protected String nome;
	protected Date datanasc;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Pessoa(String nome, String datanasc) throws ParseException {
		this.nome = nome;
		this.datanasc = sdf.parse(datanasc);
	}
	
	protected int idade() {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c2.setTime(datanasc);
		return c1.get(Calendar.YEAR) - c2.get(Calendar.YEAR);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDatanasc() {
		return datanasc;
	}

	public void setDatanasc(Date datanasc) {
		this.datanasc = datanasc;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", datanasc=" + sdf.format(datanasc) + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(datanasc, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(datanasc, other.datanasc) && Objects.equals(nome, other.nome);
	}
	
}
