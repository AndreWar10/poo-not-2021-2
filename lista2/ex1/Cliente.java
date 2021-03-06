package lista2.ex1;

//git do prof => https://github.com/dfpires/poo-noite-2021-2

/* Exercício 1

a)	Crie uma classe em Java chamada Cliente contendo as variáveis de instância private numeroConta (String), numeroAgencia (String), nome (String) e saldo (float), e os métodos getters e setters para todas as variáveis privadas. Para a criação dos métodos setters, o número da conta deve obrigatoriamente ter tamanho 8, contando o traço do dígito verificador. O número da agência deve ter tamanho 6, também contando o traço do dígito verificador. Verificar em ambos os casos a presença do dígito verificador. O nome do cliente não pode ultrapassar 30 caracteres. O saldo da conta não tem restrição;

b)	Crie os métodos public  realizarDeposito() e realizarSaque() que, realizam depósito e saque, respectivamente, na conta do cliente. Crie um outro método public para imprimir o numero da conta, nome da agencia, nome do cliente e saldo atual. Crie um método construtor para inicialização das variáveis quando um objeto da classe for criado. Forneça um construtor sem argumento com valores default caso nenhum inicializador seja fornecido;

c)	Criar uma classe Teste para instanciação da classe Cliente como Fulano. Chamar os métodos realizarDeposito() e realizarSaque() nessa classe para que o saldo seja modificado. Nao se esqueça de importar a classe Cliente na classe Teste.  

d)	Tente acessar as variáveis de instância da classe Cliente sem os métodos get e set. O que acontece?*/

public class Cliente {
    private String numeroConta, numeroAgencia;
    private float saldo;
    private String nome;
    
    public Cliente() {

    }
    public Cliente(String numeroConta, String numeroAgencia, float saldo, String nome){
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setSaldo(saldo);
        this.setNome(nome);
    }

    public final void setNumeroConta(String numeroConta){
        if ((numeroConta.length() == 8) && (numeroConta.charAt(6) == '-')){  //charAt retorna oq está na posição (x)
            this.numeroConta  = numeroConta;
        }
        else {
            System.out.println("Numero de conta inválido");
        }
    }

    public final void setNumeroAgencia(String numeroAgencia){
        if((numeroAgencia.length() == 6) && (numeroAgencia.charAt(4) == '-')){
            this.numeroAgencia = numeroAgencia;
        }
        else {
            System.out.println("Numero de Ageência inválido");
        }
    }

    public final void setSaldo(float x){
        if(x >= 0){
            this.saldo = x;
        }
        else {
            System.out.println("Saldo não pode ficar negativo");
        }
    }

    public final void setNome(String nome) {
        if (nome.length() <= 30) {
            this.nome = nome;
        }
        else {
            System.out.println("Nome excedeu o limite de caracteres");
        }
    }

    //getters
    public String getNumeroAgencia(){
        return this.numeroAgencia;
    }
    public String getNumeroConta(){
        return this.numeroConta;
    }
    public String getNome(){
        return this.nome;
    }
    public float getSaldo(){
        return this.saldo;
    }

    //dados cliente
    public String toString(){
        return "Numero da conta: " + this.numeroConta + "Numero da agencia: " + this.numeroAgencia + "Nome :" + this.nome + "Saldo: " + this.saldo;
    }

    //realizar deposito
    public void realizarDeposito(float x){
        this.setSaldo(this.saldo + x);
        //this.saldo = this.saldo + x;
    }

    //realizar saque
    public void realizarSaque(float x){
        this.setSaldo(this.saldo -x);
    }



}


