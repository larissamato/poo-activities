public class ClasseObject {

	public static void main(String[] args) {

		Object o1 = new Object();
		Object o2 = new Object();

		System.out.println("A classe do objeto 'o1': " + o1.getClass());
		System.out.println(o1.toString());
		System.out.println("O valor do hashCode: " + o1.hashCode());
		System.out.println("O objeto 'o1' igual ao objeto 'o2' ? Resposta: " + o1.equals(o2));

		o2 = o1;
		System.out.println("Agora o objeto 'o1' igual ao objeto 'o2' ? Resposta: " + o1.equals(o2));

	}
}
