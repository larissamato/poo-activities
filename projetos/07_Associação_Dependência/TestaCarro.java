
public class TestaCarro {

	public static void main(String[] args) {
		Chave ch1 = new Chave("chavekia");
		Chave ch2 = null;
		
		Carro c1 = new Carro("kia","Sorento");
		
		System.out.println(c1.toString());
		
		c1.ligarCarro(ch2);
		System.out.println(c1.toString());
		
		c1.ligarCarro(ch1);
		System.out.println(c1.toString());
		
		c1.acelerarCarro();
		c1.acelerarCarro();
		System.out.println(c1.toString());
		
		c1.reduzirCarro();
		c1.reduzirCarro();
		System.out.println(c1.toString());
		
		c1.desligarCarro(ch1);
		System.out.println(c1.toString());
	}

}
