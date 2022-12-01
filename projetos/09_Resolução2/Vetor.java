import java.util.Arrays;

public class Vetor {
	
	private int totalDeAlunos = 0;
	private Aluno[] alunos = new Aluno[3];
	
	public void adiciona(Aluno aluno) {
		this.garanteEspaco();
		if (aluno != null) {
			this.alunos[totalDeAlunos]= aluno;
			this.totalDeAlunos++;
		}
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		this.garanteEspaco();
		if (this.posicaoValida(posicao)) {
			for (int i = totalDeAlunos - 1; i >= posicao; i--) {
				this.alunos[i+1] = this.alunos[i];
			}
			this.alunos[posicao] = aluno;
			this.totalDeAlunos++;
		}
		else {
			System.out.println("Posição informada é invalida !");
		}	
	}
	
	public Aluno pega(int posicao) {
		
		if (this.posicaoValida(posicao)) {
			return this.alunos[posicao];
		}
		else {
			return null;
		}
	}
	
	public void remove(int posicao) {
		
		if (this.posicaoOcupada(posicao)) {
		
			for (int i = posicao; i < totalDeAlunos - 1 ; i++) {
				this.alunos[i] = this.alunos[i+1];
			}
			
			this.alunos[totalDeAlunos - 1] = null;
			totalDeAlunos--;
		}
	}
	
	public boolean contem(Aluno aluno) {
		if (aluno != null) {
			for (int i = 0; i < totalDeAlunos ; i++) {
				if (this.alunos[i].equals(aluno)) {
					return true;
				}
			}
		}
		return false;
	}
	
	private boolean posicaoValida(int posicao) {
		return (posicao >= 0 && posicao <= this.totalDeAlunos);
	}
	
	private boolean posicaoOcupada(int posicao) {
		return (posicao >= 0 && posicao <= this.totalDeAlunos - 1 &&  this.alunos[posicao] != null);
	}
	
	private void garanteEspaco() {
		
		if (this.totalDeAlunos == this.alunos.length) {
			Aluno[] novaArray = new Aluno[this.alunos.length + 3];
			for (int i = 0; i < this.alunos.length; i++) {
				novaArray[i] = this.alunos[i];
			}
			this.alunos = novaArray;
		}
	}
	
	
	@Override
	public String toString() {
		return "Vetor " + Arrays.toString(alunos);
	}
	
	public int tamanho() {
		return this.totalDeAlunos;
	}
	
}
