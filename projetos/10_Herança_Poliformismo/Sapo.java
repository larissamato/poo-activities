
public class Sapo extends Animal {

	public Sapo(String nome, float distancia_inicial) {
		super(nome, distancia_inicial);
	}

	@Override
	public void mover() {
		setDistancia( getDistancia() + 2.0f );
	}
}
