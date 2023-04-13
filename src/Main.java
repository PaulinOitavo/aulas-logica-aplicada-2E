public class Main {
    public static void main(String[] args) {

        // laço while
        int contador = 0;
        while (contador < 10){
            System.out.println("contador " + contador);
            // incremento
            contador = contador + 1;
        }

        //laço for
        for(int x = 0; x < 10; x++){
            System.out.println("contador " + x);
        }

        // laço do
        int cont = 0;
        do{
            //processo
            System.out.println(cont);
            cont++; // incremento
        }while (cont <= 10);
    }
}
