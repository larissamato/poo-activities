
public class Peixe extends Animal {

	public Peixe(String nome, float distancia_inicial) {
		super(nome, distancia_inicial);
	}

	@Override
	public void mover() {
		
		setDistancia( getDistancia() + 3.0f );
	}
	

}
