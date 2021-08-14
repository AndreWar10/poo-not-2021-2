package lista1;

public class TesteProduto {
    public static void main(String args[]){

        Produto prod1 = new Produto(1, "Mascara", 5, 3);
        prod1.comprar(10);
        prod1.subir(0.5f);

        System.out.println(prod1.mostra());
    }
}
