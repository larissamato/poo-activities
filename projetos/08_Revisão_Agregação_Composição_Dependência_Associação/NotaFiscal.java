import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {

	private float valor_total = 0.0f;
	private List<Item> itens = new ArrayList<>();
	
	public NotaFiscal() {

	}
	
	public void addItem(int qtde, Produto p) {
		
		if ( qtde != 0 && p != null) {
		
			Item i = new Item(qtde, p);
			
			if (!itens.contains(i)) {
				itens.add(i);	
				this.valor_total = this.valor_total + (p.getValor() * qtde);
			}
		}	
	}

	public float getValor_total() {
		return valor_total;
	}

	@Override
	public String toString() {
		return "NotaFiscal [valor_total=" + valor_total + ", itens=" + itens + "]";
	}
	
}
