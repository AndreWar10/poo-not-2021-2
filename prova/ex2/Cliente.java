package prova.ex2;

import java.util.Date;

public class Cliente extends Pedido {
    private String rg, nome;

    public Cliente(int codigo, Date data) {
        super();
    }
    
    public Cliente(int codigo, Date data, String rg, String nome) {
        super(codigo, data);
        this.setRg(rg);
        this.setNome(nome);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return super.toString() + "RG: " + this.rg + " Nome do Cliente : " + this.nome;
    }

}
