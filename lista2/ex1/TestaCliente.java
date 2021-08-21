package lista2.ex1;

public class TestaCliente {

    public static void main(String args[]){

        Cliente obj1 = new Cliente();

        obj1.setNumeroAgencia("1234-5");
        obj1.setNumeroConta("123456-7");
        obj1.setNome("Pedro");
        obj1.setSaldo(1000);
        obj1.realizarDeposito(500);
        obj1.realizarSaque(800);
        System.out.println(obj1.toString());

        Cliente obj2 = new Cliente("111111-1", "2222-2", 2000, "Felipe");
        obj2.realizarSaque(3000);
        System.out.println(obj2.toString());



    }
}