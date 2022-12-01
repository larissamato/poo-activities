public class TesteAlunoTurma {
    public static void main(String[] args){
        
        Turma t1 = new Turma("1","POOI-2021");
        Turma t2 = new Turma("2","BDII-2021");
        
        Aluno a1 = new Aluno("1","João");
        Aluno a2 = new Aluno("2","Stella");
        Aluno a3 = new Aluno("3","Thiago");
        Aluno a4 = new Aluno("4","Gessé");
        
        t1.adicionaAluno(a1);
        t1.adicionaAluno(a2);
        t1.adicionaAluno(a3);
        t1.adicionaAluno(a4);
        
        t2.adicionaAluno(a3);
        t2.adicionaAluno(a4);
                
        t1.ImprimirTurmaAluno();
        t2.ImprimirTurmaAluno();
        
        a1.ImprimirAlunoTurma();
        a3.ImprimirAlunoTurma();
    }
}
