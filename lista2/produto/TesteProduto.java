package lista2.produto;

public class TesteProduto {
    public static void main(String args[]){

        Produto prod1 = new Produto(1, "Mascara", 5, 3);
        prod1.comprar(10);
        prod1.subir(0.5f);

        //prod1.setQtde(10);

        Produto prod2 = new Produto(1, "Alcool", 5, 3);
        prod2.comprar(10);
        prod2.subir(0.5f);

        //prod2.setPreco(-13); //pode isso arnaldo? A regra é clara, não pode! 

        System.out.println(prod1.mostra());
        System.out.println(prod2.mostra());
        System.out.println("Qtde " + prod2.getQtde() + "Descrição" + prod2.getDescricao());

        Produto prod3 = new Produto();
        prod3.setQtde(10);
        prod3.setPreco(15);

        Produto prod4 = new Produto();
        prod4.setQtde(-3); //pode isso arnaldo? A regra é clara, não pode! 

        prod4.setPreco(-13);
        prod4.setId(-2);
        prod4.setDescricao("Chuveiro");

        Produto prod5 = new Produto(100,"Xícara", 5, 7);
        prod5.vender(7);
        prod5.descer(10);
        System.out.println(prod5.mostra());

        Produto prod6 = new Produto(200, "Creme de barbear", -9, -5);

        System.out.println(prod6.mostra());


    }
    }

