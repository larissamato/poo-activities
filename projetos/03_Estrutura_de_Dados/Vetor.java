import java.util.Locale;
import java.util.Scanner;

public class Exemplo {
   public static void main(String[] args) {
	
	   Locale.setDefault(new Locale("pt", "BR"));
	   
	   Scanner  sc = new Scanner(System.in);
	   
	   System.out.println("Digite a quantidade de pessoas:");
	   int n = sc.nextInt();
	   
	   double[] vetA = new double[n];
	   
	   double sum = 0;
	   
	   for(int i=0; i < vetA.length; i++) {
		   System.out.println("Digite a altura da pessoa: ");
		   vetA[i] = sc.nextDouble();
		   sum += vetA[i];
	   }
	
	   double media = sum / vetA.length;
	   
	   System.out.printf("Média: %.2f%n", media);
	   
	   sc.close();
   }
}