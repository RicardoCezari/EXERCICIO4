public class TestaAluno {
    
    public static void main (String [] args)
    {
        Aluno a1 = new Aluno();
        
        a1.setNome("Ricardo Cézari ");
        a1.setCpf ("111.111.111-11");
        
        Data d1 = new Data();
        d1.setDia (03);
        d1.setMes(10);
        d1.setAno(1998);
        a1.setdataDeNascimento(d1);
        
        String dados = a1.imprimir();     
        System.out.println(dados);
    
        
    }
  
}
