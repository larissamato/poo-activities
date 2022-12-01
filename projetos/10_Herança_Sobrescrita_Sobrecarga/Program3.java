
public class Program3 {

	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		
		System.out.println( c.somar(2, 5)  );

		System.out.println( c.somar(4, 2, 5)  );
		
		System.out.println( c.somar(2, 5.7f)  );
		
		System.out.println( c.somar(2.0f, 3.0f)  );
	}

}
