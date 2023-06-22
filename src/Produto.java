public class Produto {
    //Atributo
    boolean diet;
    private String nome;
    // Setter
    public void setNome(String _nome){
        this.nome = _nome;
    }
    double preco;

    // Métodd construtor padrão
    Produto(){}
    //metodo construtor padrao
    Produto(double _preco) {
        this.preco = _preco;
    }

    public Produto(String _nome, double _preco) {
        this.nome = _nome;
        this.preco = _preco;
    }
}
