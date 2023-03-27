public class Cadastro {
    public Cliente cliente;

    public Cadastro(){

    }

    public Cadastro(Cliente cliente){
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cadastro realizado com sucesso!" + 
        "\nNome: " + this.cliente.nome + 
        "\nCPF: " + this.cliente.cpf + 
        "\nTelefone: (" + this.cliente.telefone.ddd + ") " + this.cliente.telefone.numero;
    }

}
