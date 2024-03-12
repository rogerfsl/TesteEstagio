public class Teste1 {

    public static void main(String[] args) {

        int indice = 13;
        int k = 0;
        int soma = 0;

        for( int i = 0; i < indice; i++){
            k += 1;
            soma += k;
        }
        System.out.println(soma);
    }
}
