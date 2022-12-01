import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

public class Orientador {
    private String nome;
    private List<Aluno> listaAluno = new ArrayList<>();
    
    public Orientador(String nome){
        this.nome = nome;
    }
    
    public void addAluno(Aluno Aluno) {
        if (Aluno != null && !listaAluno.contains(Aluno)) {
            if (listaAluno.size() < 3) {
                
                listaAluno.add(Aluno);
                
                if (!Aluno.getListaOrientador().contains(this)) {
                    Aluno.addOrientador(this);
                }         
            } 
            else {
            	System.out.println ("\nAluno não cadastrado! Limite máximo de orientação alcançado!");
            }
        } else {
        	System.out.println ("\nAluno Vazio (Null) ou já existente !"); 
        }
    }
    
    public void removeAluno(Aluno Aluno) {
        if (Aluno != null && !listaAluno.contains(Aluno)) {
            if (listaAluno.size() > 0) {

                listaAluno.remove(Aluno);

                if (Aluno.getListaOrientador().contains(this)) {
                    Aluno.removeOrientador(this);
                }
            } else {
            	System.out.println ("\nLista de orientados vazia!"); 
            }
        } else {
        	System.out.println ("\nAluno vazio ou não existente na Lista!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getListaAluno() {
        return listaAluno;
    }
    
    @Override
    public String toString(){
    	return "Orientador: " + this.nome;
    }
    
    public void imprimirOrientadorAluno(){

    	System.out.println();
    	System.out.println(this.toString());
        
    	for (Aluno iAluno : this.getListaAluno()) {
            System.out.println("\t" + iAluno.toString());
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Orientador other = (Orientador) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
}
