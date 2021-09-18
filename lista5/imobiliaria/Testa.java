package lista5.imobiliaria;

public class Testa {
    
    public static void exemploPolimorfismo(Moradia camaleao){
        System.out.println(camaleao.toString());
        camaleao.calcularPreco();
    }
    public static void main(String args[]) {
        
        Apartamento ap = new Apartamento("Rua chile 123", "Franca", 80, 36, 3);
        exemploPolimorfismo(ap);

        Casa ca = new Casa("Rua Acre 234", "Franca", 200, 30, true);
        exemploPolimorfismo(ca);


    }
}
