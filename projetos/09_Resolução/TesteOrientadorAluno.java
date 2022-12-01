
public class TesteOrientadorAluno {
	
    public static void main(String[] args) {
        
        Orientador oDory = new Orientador("Dory");
        Orientador oEliezer = new Orientador("Eliézer");
       
        Aluno eMaria = new Aluno("1","Maria", oEliezer);
        Aluno eJoao = new Aluno("2","João", oEliezer);
            
        eJoao.addOrientador(oDory);
                         
        oEliezer.imprimirOrientadorAluno();
        oDory.imprimirOrientadorAluno();
            
        eMaria.ImprimirAlunoOrientador();
        eJoao.ImprimirAlunoOrientador();
        
        eJoao.addOrientador(oDory);
        
    }
}
