import java.util.Scanner;

public class ClasseScanner {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		System.out.print("Digite um valor inteiro: ");
		int i = dados.nextInt();

		System.out.print("Digite um texto: ");
		String s = dados.next();

		dados.close();

		System.out.print("\nO valor digitado foi " + i);
		System.out.print("\nTexto digitado foi " + s);
	}
}