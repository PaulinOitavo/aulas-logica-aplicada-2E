public class Main {
    public static void main(String[] args) {
        // Declarar objetos
        Pessoa rainha;
        // Instanciar objetos
        rainha = new Pessoa();
        // Definir forma de objeto
        rainha.falar();
        System.out.println(rainha.falar("alto"));
        rainha.comer();

        Produto p1 = new Produto(5.00);
        Produto p2 = new Produto();
        Produto p3;
        p3 = new Produto("bala", 2.00);
        p3 = new Produto("chiclete", 4.00);
        p1.preco = 10.0;
//        p1.nome = "chocolate";
        p1.setNome("chocolate");

    }
}
