package prova.ex1;

public class Computador {
    protected boolean status;
    protected int mem;
    
    public Computador() {
    }
    public Computador(boolean status, int mem) {
        this.setStatus(status);
        this.setMem(mem);
    }

    //getters e setters
    public boolean isStatus() {
        return status;
    }

    public int getMem() {
        return mem;
    }

    public void setStatus (boolean status) {
        this.status = status;
    }

    //upgrade da memória
    public void setMem(int x) {
        if(x == 4 || x == 8 || x == 16 || x == 32 ) {
            this.mem = x;
        } 
        else {
            this.mem = 000000000;
            System.out.println("Capacidade de RAM inválida");
        }
        
    }

    //toString() para mostrar ao usuário
    public String toString(){
        return "Computador está: " +  (this.status == true ? "Ligado" : "Desligado" )  + " Memória: " + this.mem;
    } 

    
}
