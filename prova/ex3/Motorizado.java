package prova.ex3;

//extends
public class Motorizado extends Veiculo{
    private float potencia;
    private String combustivel;
    
    public Motorizado(int ano, float preco, String descricao) {
        super();
    }

    public Motorizado(int ano, float preco, String descricao, float potencia, String combustivel) {
        super(ano, preco, descricao);
        this.setPotencia(potencia);
        this.setCombustivel(combustivel);
    }

    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    public float getPotencia() {
        return potencia;
    }
    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return super.toString() + "Potência: " + this.potencia + " Combustivel: " + this.combustivel; 
    }

}
