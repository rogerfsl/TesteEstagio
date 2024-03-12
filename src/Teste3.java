import java.util.Scanner;

public class Teste3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma string: ");

        String palavra = scan.next();
        String invertida = "";
        for (int i = palavra.length() - 1; i >= 0; i-- ){
            invertida = invertida + Character.toString(palavra.charAt(i));
        }
        System.out.println(invertida);
    }

}
