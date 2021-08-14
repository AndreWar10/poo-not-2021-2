package lista1;

public class TesteRio {
    //String args[] => array (vetor) de strings 
    public static void main(String args[]){
        //rio 1
        Rio rio1 = new Rio("Araguari", 2.3f, false);
        System.out.println(rio1.mostra()); //como rio iniciou?

        rio1.chover(0.4f);
        rio1.poluir();
        System.out.println(rio1.mostra());  //rio puuido
        
        rio1.limpar();
        System.out.println(rio1.mostra());

        //rio2
        Rio rio2 = new Rio("Rifaina", 5f, true);
        rio2.limpar();
        System.out.println(rio2.mostra());

    }
}
