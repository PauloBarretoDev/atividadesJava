public class Main {
    public static void main(String[] args) {
       Cadastro c = new Cadastro(new Cliente("Paulo Barreto", "0000000000",new Telefone(81,888888888)));
        System.out.println(c);
    }
}