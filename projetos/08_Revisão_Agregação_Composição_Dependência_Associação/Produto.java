import java.util.Objects;

public class Produto {

	private int codigo;
	private float valor;
	private String descricao;
	
	public Produto(int codigo, float valor, String descricao) {
		this.codigo = codigo;
		this.valor = valor;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(codigo, descricao, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return codigo == other.codigo && Objects.equals(descricao, other.descricao)
				&& Float.floatToIntBits(valor) == Float.floatToIntBits(other.valor);
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", valor=" + valor + ", descricao=" + descricao + "]";
	}

}
