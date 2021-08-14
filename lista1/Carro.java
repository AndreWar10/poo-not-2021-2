package lista1;

public class Carro {

    //Em Java, temos dois tipos de variáveis:
    //- tipo primitivo - int, float, double, char
    // tipo de classe - String, Float, Double, Integer

    // propriedades (variáveis da classe)
    float velocidade;  //numero com ponto flutuante
    boolean motor;  // booleana - true (on) || false (off)
    int ano; // numero inteiro 
    String modelo; // String é uma classe pronta - conjunto de caracteres

    // método construtor
    public Carro(){

    } 

    //método construtor
    public Carro(String modelo, int ano, boolean motor, float velocidade){
        //variávl do objeto := varavel do usuário
        //this representa o objeto sendo criado
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
        this.velocidade = velocidade;
    }

    // criando um método (operação)
    public void mostra(){
        // qual a palavra representa o objeto que chama o método (this.)
        System.out.println( "Modelo: " + this.modelo+ " Ano: " + this.ano+ " Vel: " + this.velocidade);
    }
}

