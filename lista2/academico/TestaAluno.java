
package lista2.academico;
import javax.swing.JOptionPane;
public class TestaAluno {

    public static void main(String args[]){
        Aluno obj1 = new Aluno();
        //obj1.setIdade(JOptionPane.showInputDialog("Informe sua idade")); retorna uma string
        //então devemos converter para int
        obj1.setNome(JOptionPane.showInputDialog("Informe o nome:"));
        obj1.setNumeroAluno(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero do aluno: ")));
        obj1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade")));
        obj1.setP1(Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da p1")));
        obj1.setP2(Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da p2")));
        
        //System.out.println(obj1.toString()); //forma alternativa
        //null indica que a caixa de dialogo não tem pai
        JOptionPane.showMessageDialog(null, obj1.toString());

    }

    


    
}
