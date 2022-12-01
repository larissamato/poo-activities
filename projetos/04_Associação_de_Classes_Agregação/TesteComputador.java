public class TesteComputador {

	public static void main(String[] args) {
		
		Computador c = new Computador("Dory");
		Monitor m1 = new Monitor("Samsung");
		Monitor m2 = new Monitor("Philips");
		
		System.out.println(c);
		
		c.addMonitor(m1);
		System.out.println(c);
		
		c.addMonitor(m2);
		System.out.println(c);		
		
		c.removeMonitor();
		System.out.println(c);	
		
		c.addMonitor(m2);
		System.out.println(c);
	}	
}