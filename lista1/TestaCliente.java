package lista1;

public class TestaCliente {
    public static void main(String args[]){
        Cliente obj1 = new Cliente(001, 123456789,"André", 1000);
        obj1.depositar(1000);   //depositando
        obj1.sacar(365);        //sacando

        System.out.println(obj1.dadosCliente());    //dados cliente 
        
        Cliente obj2 = new Cliente(002, 987654321,"Gustavo", 0);
        obj2.depositar(2650);   //depositando

        System.out.println(obj2.dadosCliente());    //dados do cliente2
    }    
}
