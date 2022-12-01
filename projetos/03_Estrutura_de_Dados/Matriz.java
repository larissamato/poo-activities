import java.util.Scanner;

public class exemplo {
	public static void main(String[] args) {

		Locale.setDefault(new Locale("pt", "BR"));

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a dimensão da matriz: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				sc.nextLine();
				System.out.printf("Digite o valor[%d][%d]: ", i+1 , j+1);
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Diagonal Principal:");
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println("");
		System.out.print("Diagonal Secundária:");
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (i+j+1 == mat.length )
					System.out.print(mat[i][j] + " ");
			}
		}	
		sc.close();
	}
}

