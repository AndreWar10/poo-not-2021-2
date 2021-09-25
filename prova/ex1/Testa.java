package prova.ex1;

public class Testa {

    public static void main(String args[]) {
        Computador pc1 = new Computador(true , 16);

        System.out.println(pc1.toString());

        //pc1.setMem(15);
        pc1.setStatus(false);
        System.out.println(pc1.toString());

    }
    
}
