package lista3.venda;
import java.util.ArrayList;
import java.util.Date;

public class Venda {

    private int codigo;
    private float valorTotal;
    private Date data;
    //ArrayList
    private ArrayList<ItemVenda> itens;
    
    //ArrayList com agregação
    public Venda() {
        //alocar espaço p/ vetor
        this.itens = new ArrayList<ItemVenda>();
    }
    
    public Venda(int codigo, float valorTotal, Date data) {
        this.setCodigo(codigo);
        this.setValorTotal(valorTotal);
        this.setData(data);
        this.setItens(itens);
        this.itens = new ArrayList<ItemVenda>();
    }
    
    public ArrayList<ItemVenda> getItens() {
        return itens;
    }
    public void setItens(ArrayList<ItemVenda> itens) {
        this.itens = itens;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public float getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    //Adiciona um item de venda - composição
    public void addItemVenda(int codigo, String nome, int qtde, float valor){
        // item venda depende da venda
        this.itens.add(new ItemVenda(codigo, nome, qtde, valor));
    }

    //Código acima em Agregação
    //public void addItemVenda(ItemVenda itemVenda){
        //item venda depende da venda
        //this.itens.add(itemVenda);
    //}

    public String toString(){
        return "Código: " + this.codigo + "Valor Total: " + this.valorTotal + "Data: " + this.data + " \n Itens da venda: " + this.itens.toString();
    }

    
    
}
