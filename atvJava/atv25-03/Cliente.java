public class Cliente {
    public String nome;
    public String cpf;
    public Telefone telefone;

    public Cliente(){

    }
    
    public Cliente(String nome, String cpf, Telefone telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public Telefone getTelefone(){
        return this.telefone;
    }

    public void setTelefone(Telefone telefone){
        this.telefone = telefone;
    }

    
}
