import java.util.Objects;

public class Item {
	
	private int qtde;
	private Produto produto;
	
	public Item(int qtde, Produto p) {
		this.qtde = qtde;
		this.produto = p;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(produto, qtde);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(produto, other.produto);
	}

	@Override
	public String toString() {
		return "Item [qtde=" + qtde + ", produto=" + produto.getDescricao() + "]";
	}
	
	
}
