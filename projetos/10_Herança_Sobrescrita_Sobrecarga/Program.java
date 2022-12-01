import java.text.ParseException;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Pessoa p1 = new Pessoa ("Caroline", "24/04/1978");
		Professor prof1 = new Professor("Dory", "31/03/1976","Informática");
		Aluno a1 = new Aluno("João", "01/01/1995", "Bacharelado de Sistema de Informação");
		
		System.out.println( p1.toString() );
		System.out.println( prof1.toString() );
		System.out.println( a1.toString() );
		
		System.out.println( p1.idade() );
		System.out.println( prof1.idade() );
		System.out.println( a1.idade() );

	}

}
