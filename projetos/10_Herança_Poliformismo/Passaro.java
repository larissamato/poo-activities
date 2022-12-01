
public class Passaro extends Animal {

	public Passaro(String nome, float distancia_inicial) {
		super(nome, distancia_inicial);
	}

	@Override
	public void mover() {
		setDistancia( getDistancia() + 4.0f );
	}
}
