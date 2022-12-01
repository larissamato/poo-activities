import java.util.ArrayList;
import java.util.List;

public class TesteAnimal1 {
	public static void main(String[] args) {
		
		List<Animal>  listaAnimais = new ArrayList<>();
		Animal 	a1 = new Peixe("Tucunaré", 0.0f);
		Animal 	a2 = new Sapo("Cururu", 0.0f);
		Animal  a3 = new Passaro("Andorinha", 0.0f);
		
		listaAnimais.add(a1);
		listaAnimais.add(a2);
		listaAnimais.add(a3);
		
		System.out.println("--- Animais e a distância de seus passos -----");
		for (Animal animal : listaAnimais) {	
			animal.mover();
			System.out.println(animal.getNome() + ": " + animal.getDistancia() + " metros !" );
		}
	}
}


