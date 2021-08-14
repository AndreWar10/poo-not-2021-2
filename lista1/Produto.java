package lista1;
/* EX3 - 

Implemente em Java uma classe chamada Produto contendo as variáveis id (int), descrição (String), qtde (int) e preco (float). Essa classe deve possuir os dois métodos construtores, com e sem parâmetros, e ainda os métodos:

· comprar(int x): que compra um produto aumentando em x a quantidade em estoque;

· vender(int x): que vende um produto diminuindo em x a quantidade em estoque;

· subir(float x): que aumenta o preço do produto em x unidades;

· descer(float x): que diminui o preço do produto em x unidades;

· mostra(): que mostra todas as informações do produto

Finalmente, cria uma classe TestaProduto, que cria dois Produtos (cada um deve utilizar um construtor diferente) e teste os métodos criados.

*/


public class Produto {
    public int id, qtde;
    public String descricao;
    public float preco;

    //construtor Produto
    public Produto(){

    }
    public Produto(int id, String descricao, int qtde, float preco){
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }

    // comprar
    public void comprar(int x) {
        this.qtde += x;
    }

    // vender 
    public void vender(int x) {
        this.qtde -= x;
    }

    // subir 
    public void subir(float x) {
        this.preco += x;
    }

    // descer
    public void descer(float x){
        this.preco -= x;
    }

    //mostrar
    public String mostra() {
        return String.format("Nome: %s Qtde: %d Preco: %.2f", this. descricao, this.qtde, this.preco);
    }
}
