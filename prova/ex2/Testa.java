package prova.ex2;
import java.util.Date;

public class Testa {
    public static void main(String args[]) {
        
        Cliente Andre = new Cliente(007, new Date(), "551263696", "André" );
        System.out.println(Andre.toString());

        Unidade Ciapizza = new Unidade(123, new Date(), "Franca", "SP");
        System.out.println(Ciapizza.toString());
    }
    
}
