package lista1;
public class TestaCarro {
    
    // vamos criar os objetos
    // vamos criar metodo main

    public static void main(String args[]){

        // vamos dar um Hello World
        System.out.println("Hello Word");
        // vamos criar um carro
        Carro obj1 = new Carro();
        obj1.modelo = "Onix";
        obj1.ano = 2019;
        obj1.motor = true;
        obj1.velocidade = 30;

        Carro obj2 = new Carro("Celta", 2016, true, 50); //chama o método construtor (inicializa os valores)

        //Manualzão ~>
        //System.out.println( "Obj1: Modelo: " + obj1.modelo+ " Ano: " + obj1.ano+ " Vel: " + obj1.velocidade);
        //System.out.println( "Obj2: Modelo: " + obj2.modelo+ " Ano: " + obj2.ano+ " Vel: " + obj2.velocidade);

        //Usando método: mostra()
        obj1.mostra();
        obj2.mostra();

    }

}

