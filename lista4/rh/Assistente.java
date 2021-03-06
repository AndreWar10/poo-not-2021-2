package lista4.rh;

public class Assistente extends Funcionario{

    private float horaExtra;

    public Assistente() {
        super(); // chama construtor da superclasse
    }
    
    
    public Assistente(String nome, String rg, float salario, float horaExtra) {
        super(nome, rg, salario); // chama construtor da superclasse - reutilização de código
        this.setHoraExtra(horaExtra);
    }

    public float getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

   @Override // sobrescrever ou anular
   public String toString(){
       return " Hora-Extra " + this.horaExtra + super.toString();
   }


@Override
public void receberSalarioTotal() {
    float aux = this.salario + 40*this.horaExtra;
    System.out.println("Salario total" + aux);
    
}

    
    
    
}