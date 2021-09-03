package lista3.venda;
import java.util.Date;

public class Testa {

    public static void main(String args[]){

        Venda v1 = new Venda(10, 500, new Date());
        v1.addItemVenda(1, "Alcool Gel", 5, 10);
        v1.addItemVenda(2, "Mascara", 3, 10);
        v1.addItemVenda(3, "Camiseta", 10, 42);

        System.out.println(v1.toString());
    }
    
}
