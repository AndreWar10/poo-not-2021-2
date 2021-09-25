package prova.ex3;

//abstract pois é o pai
public abstract class Veiculo {
    protected int ano;
    protected float preco;
    protected String descricao;

    public Veiculo() {
    }
    
    public Veiculo(int ano, float preco, String descricao) {
        this.setAno(ano);
        this.setPreco(preco);
        this.setDescricao(descricao);
    }
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    //mostragem terminal
    public String toString() {
        return "Ano: " + this.ano + "Preço: " + this.preco + "Descrição: " + this.descricao;
    }
}
