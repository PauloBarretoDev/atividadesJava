public class Telefone {
    public int ddd;
    public int numero;

    public Telefone(){
        
    }

    public Telefone(int ddd, int numero){
        this.ddd = ddd;
        this.numero = numero;
    }

    public int getDDD(){
        return this.ddd;
    }
    
    public void setDDD(int ddd){
        this.ddd = ddd;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void alterarDDD(int novoDdd){
        this.ddd = novoDdd;
    }

    public void alterarNumero(int novoNumero){
        this.numero = novoNumero;
    }
}
