package lista1;
public class TestaAluno {
    
    //public indica que o método é publico
    //static indica que o metodo é de classe
    //void indica que o metodo NÃO RETORNA NADA
    //string args[] indica que o metodo recebe como parametro um array de strings
    public static void main(String args[]){

        // vamos criar uma instancia de aluno
        Aluno obj1 = new Aluno(456, "Dirceu", 25, 9, 8);   //chama construtor Aluno()
        //System.out.println ->> mostra os dados PARA O USUÁRIO (como print).
        System.out.println(obj1.dadosAluno());
        System.out.println(obj1.passou());

        //chama construtor Aluno(int, String, int, float, float) 
        Aluno obj2 = new Aluno(123, "Pedro", 20, 8, 7); 
        System.out.println(obj2.dadosAluno());
        System.out.println(obj2.passou());

    }
    
}

