package lista4.rh;
import java.util.ArrayList;

public class Testa {

    public static void exemploPolimorfismo(Funcionario camaleao){
        //camaleão pode representar um assistente, gerente ou diretor.
        System.out.println(camaleao.toString());
        camaleao.receberSalarioTotal();
    }

    public static void fecharFolha(ArrayList<Funcionario> funcs){
        
        for(int i=0;i< funcs.size();i++){
            funcs.get(i).receberSalarioTotal(); //polimorfismo
        }
    }
    
    public static void main(String args[]){
        Assistente as1 = new Assistente("Fulano", "123", 2000, 2);
        exemploPolimorfismo(as1);

        Gerente ger1 = new Gerente("Beltrano", "456", 4000, 10, "batida 100%");
        exemploPolimorfismo(ger1);
        

        Diretor dir1 = new Diretor("Ciclano", "789", 6000, "Civic");
        exemploPolimorfismo(dir1);
        //System.out.println(dir1.toString());
        //dir1.receberSalarioTotal();

        ArrayList<Funcionario> funcs = new ArrayList<Funcionario>();
        funcs.add(as1);
        funcs.add(ger1);
        funcs.add(dir1);
        fecharFolha(funcs);
    }
}
