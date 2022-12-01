import java.util.ArrayList;
import java.util.List;

public class TesteAnimal2 {
	public static void main(String[] args) {
		
		List<Animal>  listaAnimais = new ArrayList<>();
		Animal 	a1 = new Peixe("Tucunaré", 0.0f);
		Animal 	a2 = new Sapo("Cururu", 0.0f);
		Animal  a3 = new Passaro("Andorinha", 0.0f);
		
		listaAnimais.add(a1);
		listaAnimais.add(a2);
		listaAnimais.add(a3);
		a1.mover();
		a2.mover();
		a3.mover();
		
		System.out.println("--- Lista de Animais -----");
		for (Animal animal : listaAnimais) {
			if (animal.getClass().getName() == "Passaro")
				System.out.println("Pássaro : " +  animal.getNome() + "  " + animal.getDistancia() );
			if (animal.getClass().getName() == "Sapo")
				System.out.println("Sapo : " + animal.getNome() + "  " + animal.getDistancia() );
			if (animal.getClass().getName() == "Peixe")
				System.out.println( "Peixe : " + animal.getNome() + "  " + animal.getDistancia() );
		}
	}
}


