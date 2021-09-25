package prova.ex2;

import java.util.Date;

public class Unidade extends Pedido {
    private String cidade, estado;

    public Unidade() {
        super();
    }
    
    public Unidade(int codigo, Date data, String cidade, String estado ) {
        super(codigo, data);
        this.setCidade(cidade);
        this.setEstado(estado);
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString(){
        return super.toString() + "Cidade: " + this.cidade + " Estado : " + this.estado;
    }

}
