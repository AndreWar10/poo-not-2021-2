package prova.ex2;
import java.util.Date;

//Apenas o pai é abstract
public abstract class Pedido {
    protected int codigo;
    protected Date data;
    
    public Pedido() {
    }

    public Pedido(int codigo, Date data) {
        this.setCodigo(codigo);
        this.setData(data);
    }

    //getters e setters
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String toString() {
        return "Código do pedido: " + this.codigo + "Data do Pedido: " + this.data ;
    }
    
}