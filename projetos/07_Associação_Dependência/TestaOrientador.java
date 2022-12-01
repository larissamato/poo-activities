
public class TestaOrientador {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("1","João");
		Aluno a2 = new Aluno("2","Maria");
		
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println("---------");
		Professor p1 = new Professor("Dory");
		System.out.println(p1);
		
		System.out.println("--------");
		Orientacao o1 = new Orientacao(p1, a1, "Trabalho PHP");
		Orientacao o2 = new Orientacao(p1, a2, "Trabalho POO");
		System.out.println(o1);
		System.out.println(o2);
		
		System.out.println(p1.getListaOrientacao());
		

	}

}
