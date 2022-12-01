import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Turma {
    
    private String codigo;
    private String nome;
    List<Aluno> listaAluno = new ArrayList<>();  
    
    public Turma(String codigo, String nome) {
    	this.codigo = codigo;
        this.nome = nome;
    }
    
    public boolean adicionaAluno (Aluno a) {
        boolean sucesso = false;
        
        if (a != null && !listaAluno.contains(a)) {
            listaAluno.add(a);
            sucesso = true;
            
            if (!a.listaTurma.contains(this)){
                a.adicionaTurma(this);
            }
        }
        return sucesso;
    }
    
     public boolean removeAluno (Aluno a) {
        boolean sucesso = false;
        
        if (!listaAluno.isEmpty() && listaAluno.contains(a)) {
            listaAluno.remove(a);
            sucesso = true;
            
            if (a.listaTurma.contains(this)){
                a.removeTurma(this);
            }
        }
        return sucesso;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public List<Aluno> getListaAluno() {
        return listaAluno;
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
        final Turma other = (Turma) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Turma [codigo="+codigo+" | nome: "+nome+"]";
    }
    
    public void ImprimirTurmaAluno(){
        
        System.out.println();
        System.out.println(this.toString());
        
        for (Aluno iAluno : this.getListaAluno()){
            
            System.out.println("-- " + iAluno.toString() );            
        } 
    }
}