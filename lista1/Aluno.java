package lista1;
/* EX 1 - 

· Crie uma classe em Java chamada Aluno contendo as variáveis de instância numeroAluno (int), nome (String), idade (int), p1 (float) e p2 (float),

· Crie os construtores

· Crie os métodos notaFinal() - que calcula e retorna a média final do aluno - , e dadosAluno() - que retorna os valores de numeroAluno, nome e idade.

· Criar uma classe TestaAluno com o método main() para instanciação da classe Aluno (atribuição das variáveis de instância com quaisquer valores e chamada dos métodos notaFinal() e dadosAluno()).

· Adicionar o método passou() à classe Aluno a fim de verificar se o aluno passou. Chame o método passou() na classe TestaAluno a fim de testa-lo

*/

public class Aluno {
    public int numeroAluno, idade;  //int é tipo primitivo
    public String nome; //String é uma classe, por isso começa com letra maiuscula
    public float p1, p2; //float é tipo primitivo

    // construtor sem parâmetro (criar alunos sem passar parâmetro)
    public Aluno(){

    }
    // construtor com parâmetro
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2 ) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1= p1;
        this.p2 = p2;
    }

    //quando criamos variavel de fora do métodos, devemos ultilizar o  << this. >>

    //função que retorna a média
    public float notaFinal() {
        float media = (this.p1 + this.p2) / 2;
        return media;
    }

    // função que retorna dados do aluno
    public String dadosAluno() {
        return "Numero do aluno " + this.numeroAluno + " Nome: " + this.nome + " nota final " + this.notaFinal();
    }

    //verifica se passou
    public String passou() {
        if (this.notaFinal() >= 6){
            return "Aprovado!";

        }
        else {
            return "Reprovado";
        }

        //com operador ternário:
        //return(this.notaFinal() >= 6? ? "aprovado" : "reprovado";
    }



}
