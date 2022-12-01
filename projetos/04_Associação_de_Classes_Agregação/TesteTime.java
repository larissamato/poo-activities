public class TesteTime {

	public static void main(String[] args) {
				
		Tecnico t1 = null;
		Tecnico t2 = new Tecnico("Tite");
		Tecnico t3 = new Tecnico("Caio");		
		
		Time tm;
		
		try {
			tm = new Time("Brasil", t1);
			System.out.println(tm);			
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}			
		tm = new Time("Brasil", t2);
		System.out.println(tm);
		
		tm.trocaTecnico(t3);
		System.out.println(tm);
	}	
}
