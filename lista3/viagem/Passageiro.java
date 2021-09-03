package lista3.viagem;

public class Passageiro {

    private String rg; //click lamp to create constructor, getters/setters
    private String cpf;
    private String nome;

    //construtor sem parâmetro criado com lâmpada
    public Passageiro() {
    }

    //constructor com parâmetros
    public Passageiro(String rg, String cpf, String nome) {
        this.setRg(rg);
        this.setCpf(cpf);
        this.setNome(nome);
    }

    public String getNome() { //getters
        return nome;
    }
    
    public void setNome(String nome) { //setters
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getRg() {
        return rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    
    //converter passageiro em string
    public String toString(){
        return "Nome: " + this.nome + "RG: " + this.rg + "CPF: " + this.cpf;
    }

    
}
