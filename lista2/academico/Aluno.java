package lista2.academico;

public class Aluno {

    private float p1, p2;
    private int idade, numeroAluno;
    private String nome;

    public Aluno(){

    }
    public Aluno(String nome, int numeroAluno, int idade, float p1, float p2){
        this.setNome(nome);
        this.setNumeroAluno(numeroAluno);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }

    //setters
    public final void setNome(String nome){
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else{
            System.out.println("Nome não pode ser grandiosamente grande");
        }
    }

    public final void setNumeroAluno(int numeroAluno){
        //converter para string e descobrir tamanho
        //String numeroAlunoString = Integer.toString(numeroAluno); //maneira alternativa
        String numeroAlunoString = String.valueOf(numeroAluno);
        if (numeroAlunoString.length() == 6) {
            this.numeroAluno = numeroAluno;
        }
        else {
            System.out.println("Numero do aluno não pode ser negativo");
        }
    }

    public final void setP1(float p1){
        if (p1 >= 0){
            this.p1 = p1;
        }
        else {
            System.out.println("Nota p1 não pode ser negativa");
        }
    }

    public final void setP2(float p2){
        if (p2 >= 0){
            this.p2 = p2;
        }
        else {
            System.out.println("Nota p2 não pode ser negativa");
        }
        
    }

    public final void setIdade(int idade){
        if (idade >= 0){
            this.idade = idade;
        }
        else {
            System.out.println("Idade não pode ser negativa");
        }
    }

    //getters - métodos que retornam x => :.acessar valor das variaveis em outra classe
    public int getIdade(){
        return this.idade;
    }
    public float getP1(){
        return this.p1;
    } 
    public float getP2(){
        return this.p2;
    }
    public String getNome(){
        return this.nome;
    }
    public int getNumeroAluno(){
        return this.numeroAluno;
    }


    public String toString(){
        return "Nome: " +this.nome + "Numero do aluno: " +this.numeroAluno + "p1: " +this.p1 + "p2: " +this.p2 + "idade: " +this.idade + "Nota final: " +this.NotaFinal();
    }

    public float NotaFinal(){
        return (this.p1 + this.p2) / 2;
    }
    


}
