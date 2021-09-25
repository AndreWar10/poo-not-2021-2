package prova.ex3;

public class Testa {

    //Polimorfismo, item "D"
    public static void Polimorfismo(Veiculo x){
        System.out.println(x.toString());
    }

    public static void main(String args[]) {
        
        Motorizado Volks = new Motorizado(2020, 85000, "SUV", 190, "Flex");
        Polimorfismo(Volks);

        NaoMotorizado Bike = new NaoMotorizado(1810, 20, "Bike do zé", "Bicicleta");
        Polimorfismo(Bike);

    }    
}
