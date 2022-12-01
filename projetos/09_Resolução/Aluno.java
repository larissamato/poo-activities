import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {
    
    private String matricula;
    private String nome;
    List<Turma> listaTurma = new ArrayList<>();
    List<Orientador> listaOrientador = new ArrayList<>();

    public Aluno(String matricula, String nome) {
    	this.matricula = matricula;
        this.nome = nome;
    }
    
    public Aluno(String matricula, String nome, Orientador o) {
    	this.matricula = matricula;
        this.nome = nome;
        this.addOrientador(o);
    }
    
    public void addOrientador(Orientador o) {
        if (o != null && !listaOrientador.contains(o)) {
            if (listaOrientador.size() < 2) {
                
                listaOrientador.add(o);
                
                if (!o.getListaAluno().contains(this)) {
                	o.addAluno(this);
                }
            } else {
                System.out.println ("\nOrientador não cadastrado! Limite máximo de orientador alcançado!"); 
            }
        } else {
        	System.out.println ("\nOrientador Vazio (Null) ou já existente !"); 
        }
    }
    
    public void removeOrientador(Orientador o) {
        if (o != null && listaOrientador.contains(o)) {
            if (listaOrientador.size() >= 2) {

                listaOrientador.remove(o);

                if (o.getListaAluno().contains(this)) {
                    o.removeAluno(this);
                }
            } else {
            	System.out.println ("\nOrientador não pode ser removido devido limite mínimo de orientador cadastrado!"); 
            }
        } else {
        	System.out.println ("\nOrientador vazio ou não existente na Lista!");
        }
    }

    public boolean adicionaTurma (Turma t) {
    	
        boolean sucesso = false;        
        
        if (t != null && !listaTurma.contains(t)) {
            
        	listaTurma.add(t);
            sucesso = true;
        
            if (!t.listaAluno.contains(this)){
                t.adicionaAluno(this);
            }
        }
        return sucesso;
    }
    
    public boolean removeTurma (Turma t) {
        
    	boolean sucesso = false;
        
    	if (!listaTurma.isEmpty() && listaTurma.contains(t)) {
            listaTurma.remove(t);
            sucesso = true;
        
            if (t.listaAluno.contains(this)){
                t.removeAluno(this);
            }
        }
        return sucesso;
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
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    public String getNome() {
        return nome;
    }
    
    public List<Orientador> getListaOrientador() {
        return listaOrientador;
    }
    
    public List<Turma> getListaTurma() {
        return listaTurma;
    }
    
    @Override
    public String toString() {
        return "Aluno [matricula= "+matricula+" | nome: "+nome+"]";
    }
      
    public void imprimirAlunoTurma(){
        
        System.out.println();
        System.out.println(this.toString());
        
        for (Turma iTurma : this.getListaTurma()){ 
            System.out.println("-- " + iTurma.toString() );            
        } 
    }
    
    public void ImprimirAlunoOrientador(){
        
        System.out.println();
        System.out.println(this.toString());
        
        for (Orientador iOrientador : this.getListaOrientador()){ 
            System.out.println("-- " + iOrientador.toString() );            
        } 
    }
}