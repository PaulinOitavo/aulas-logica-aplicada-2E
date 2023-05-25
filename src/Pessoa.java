public class Pessoa extends Animal{
    // Atributos da pessoa

    public String sobrenome;
    // Métodos da classe
    public void falar(){
        System.out.println("falei");
    }
    // Sobrecarga do método falar()
    public String falar(String volume) {
        return "falei" + volume;
    }
    // Sobrescrita do método
    public void comer() {
        System.out.println("Comeu como pessoa");
    }
}
