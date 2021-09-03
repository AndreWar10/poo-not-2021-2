package lista3.viagem;
import java.util.Date;

public class Reserva {

    private int codigo;
    private Date data;
    private float valor;
    //associação abaixo
    private Passageiro passageiro;  //Passageiro é a classe e passageiro é o objeto
    private Voo voo;                //Voo é a classe e voo é o objeto
    
    //constructor sem parametros
    public Reserva() {
    }

    
    //constructor com parametros
    public Reserva(int codigo, Date data, float valor, Passageiro passageiro, Voo voo) {
        this.setCodigo(codigo);
        this.setData(data);
        this.setValor(valor);
        this.setPassageiro(passageiro);
        this.setVoo(voo);
    }

    //getters & setters
    public Voo getVoo() {
        return voo;
    }

    //setter voo
    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    //getter passageiro
    public Passageiro getPassageiro() {
        return passageiro;
    }

    //setter passageiro :.
    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

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

    //mostragem em String
    public String toString() {
        return "Código: " + this.codigo + "Data: " + this.data + "Valor: " + this.valor + "\n Passageiro: " + 
        this.passageiro.toString() + "\n Voo: " + this.voo.toString();
    }










    
    
}
