public class TesteConta {

	public static void main(String[] args) {
		
		Conta c;
		Cliente t1 = new Cliente("123.456.789-00");		
		Cliente t2 = new Cliente("987.654.321-00");
		Cliente t3 = null;
		
		try {
			c = new Conta("Ouro", t3);
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}
		
		c = new Conta("Platinum", t1);
		c.addCliente(t2);
		System.out.println(c);
		
		c.removerCliente(t1);
		System.out.println(c);				
	}	
}

