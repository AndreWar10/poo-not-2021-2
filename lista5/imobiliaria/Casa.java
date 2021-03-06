package lista5.imobiliaria;

public class Casa extends Moradia{
    private float tamanhoQuintal;
    private boolean piscina;
    public Casa(){
        super(); // reutilização de código
    }
    public Casa(String endereco, String cidade, float tamanho, float tamanhoQuintal, boolean piscina) {
        super(endereco, cidade, tamanho); // reutilização de código
        this.setTamanhoQuintal(tamanhoQuintal);
        this.setPiscina(piscina);
    }
    public boolean isPiscina() {
        return piscina;
    }
    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }
    public float getTamanhoQuintal() {
        return tamanhoQuintal;
    }
    public void setTamanhoQuintal(float tamanhoQuintal) {
        this.tamanhoQuintal = tamanhoQuintal;
    }
    @Override // anulação
    public String toString(){
        return super.toString() + " Quintal " + this.tamanhoQuintal + " tem piscina: " + this.piscina;
    }

    @Override
    public void calcularPreco() {
        float aux;
        aux = (this.tamanho * 500) + (this.tamanhoQuintal * 100);
        if (this.piscina) {
            aux = aux + 1000;
        }
        System.out.println("Valor da casa é de :" + aux);
    }
    
}