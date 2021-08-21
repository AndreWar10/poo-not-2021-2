package lista2.produto;
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
    private int id, qtde;
    private String descricao;
    private float preco;

    //construtor Produto
    public Produto(){

    }
    public Produto(int id, String descricao, int qtde, float preco){
        this.setId(id);
        this.setDescricao(descricao);
        this.setQtde(qtde);
        this.setPreco(preco);
    }

    //vamos criar os métodos setters (maneira de encapçular as variaveis)
    //método final não pode ser alterado nas classes filhas
    public final void setQtde(int qtde){
        if (qtde >=0){
            this.qtde = qtde;
        }
        else {
        System.out.println("Qtde de produto não pode ser negativo");
        }
    }
    
    public final void setPreco(float preco){
        if (preco >=0) {
            this.preco = preco;
        }
        else {
            System.out.println("Preço de produto não pode ser negativo");
        }
    }

    public final void setId(int id) {
        if (id >= 0) {
            this.id = id;
        }
        else {
            System.out.println("Id de produto não pode ser negativo");
        }
    }

    public final void setDescricao(String descricao) {
        if (!descricao.isEmpty()) { //se descricao não for vazio
            this.descricao = descricao;
        }
        else {
            System.out.println("Descricao de produto não pode estar em branco");
        }
    }

    //getters
    public int getQtde() {
        return this.qtde;
    }

    public float getPreco() {
        return this.preco;
    }

    public int getId() {
        return this.id;
    }

    public String getDescricao() {
        return this.descricao;
    }

    // comprar
    public void comprar(int x) {

        this.qtde += x;
    }

    // vender 
    public void vender(int x) {

        this.setQtde(this.qtde - x);
    }

    // subir 
    public void subir(float x) {
        this.setPreco(this.preco + x);
    }

    // descer
    public void descer(float x){
        this.setPreco(this.preco - x);
    }

    //mostrar
    public String mostra() {
        return String.format("Id: %s Nome: %s Qtde: %d Preco: %.2f", this.id, this.descricao, this.qtde, this.preco);
    }
}
