package lista1;
/* EX 2- 

Crie uma classe em Java chamada Cliente contendo as variáveis de instância numeroConta (int), numeroAgencia (int), nome (String) e saldo (float),

· Crie os construtores

· Crie os métodos public realizarDeposito() e realizarSaque() que, realizam depósito e saque, respectivamente, na conta do cliente.

· Crie um outro método public que retorna o numero da conta, nome do cliente e saldo atual.

· Criar uma classe TestaCliente para instanciação da classe Cliente como Fulano. Chamar os métodos realizarDeposito() e realizarSaque() nessa classe para que o saldo seja modificado

· Criar, também na classe TestaCliente, um outro cliente (Beltrano) e realizar as mesmas atividades do Fulano.

*/

public class Cliente {
    public int numeroConta, numeroAgencia;
    public String nome;
    public float saldo;

    //construtor cliente
    public Cliente() {

    }
    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;  
    }

    // depositar valor x
    public void depositar(float x){
        this.saldo = this.saldo + x;
    }

    //sacar valor x
    public void sacar(float x){
        if (this.saldo - x >= 0) {
            //this.saldo = this.saldo - x;
            this.saldo -= x;    //forma abreviada
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }

    //função dados do cliente
    public String dadosCliente() {
        return "Numero da conta: " + this.numeroConta + "  Numero da agência: " + this.numeroAgencia + "  Nome do cliente: " + this.nome + "  Saldo da conta: " + this.saldo;
    }

    
    
    // retorna 
}
