package lista1;
/* EX 4 - 

Implemente em Java uma classe chamada Rio contendo as variáveis nome(String), nível (float) e poluído (boolean). Essa classe deve possuir os dois métodos construtores, com e sem parâmetros, e ainda os métodos:

· chover(float): que aumenta o nível atual do rio;

· ensolarar(float): que diminui o nível atual do rio;

· limpar(): que limpa o rio;

· sujar(): que polui o rio;

· mostra(): que mostra todas as informações do rio.

Finalmente, cria uma classe TestaRio, que cria dois Rios (cada um deve utilizar um construtor diferente) e teste os métodos criados.

*/

public class Rio {

    public String nome;
    public float nivel;
    public boolean poluido; //rio poluido = true || rio limpo = false

    public Rio(){

    }

    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido; 
    }

    //chover(subir)
    public void chover(float x){
        this.nivel += x;
    } 

    //ensolarar (descer)
    public void ensolarar(float x){
        this.nivel -= x;
    } 

    //limpar
    public void limpar(){
        this.poluido = false;
    }

    //poluir
    public void poluir(){
        this.poluido = true;
    }

    //mostra
    public String mostra(){
        String auxiliar = this.poluido? "Está poluido" : "Não está poluido";
        return "Nome: " + this.nome + "Nível: " + this.nivel + " " + auxiliar;
    }

}
