package lista3.redesocial;

public class Testa {

    public static void main(String args[]){

        Usuario usr1 = new Usuario("fulano@gmail.com", "123");

        Usuario usr2 = new Usuario("beutrano@gmail.com", "321");

        Usuario usr3 = new Usuario("ciclano@gmail.com", "443");

        RedeSocial rs = new RedeSocial();
        rs.setCodigo(1);
        rs.setNome("Instagram");
        rs.setUrl("www.instagram.com.br");
        rs.addUsuario(usr1);    //adiciona o usuario na rede social
        rs.addUsuario(usr2);    //adiciona o usuario na rede social 
        rs.addUsuario(usr3);    //adiciona o usuario na rede social

        System.out.println(rs.toString());


    }
    
}
