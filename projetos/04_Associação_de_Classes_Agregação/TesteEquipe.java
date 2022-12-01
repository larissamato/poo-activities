public class TesteEquipe {

	public static void main(String[] args) {
		
		Atleta a1 = new Atleta("Dory", "Atacante");
		Atleta a2 = new Atleta("Rafael", "Zagueiro");
		Atleta a3 = new Atleta("Dory", "Atacante");
		Atleta a4 = null;
		Atleta a5 = new Atleta("Felipe", "Meia");
		
		Equipe t = new Equipe("Goiás");
		
		t.addAtleta(a1);
		t.addAtleta(a2);
		t.addAtleta(a3);
		t.addAtleta(a4);		
		System.out.println(t);
		
		t.addAtleta(a5);		
		System.out.println(t);		
	}	
}






