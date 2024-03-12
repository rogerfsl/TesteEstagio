import java.util.Scanner;

public class Teste2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scan.nextInt();
        if(pertenceFibonacci(num)){
            System.out.println("O número " + num + " pertence a sequencia.");
        }else{
            System.out.println("O número " + num + " não pertence a sequencia.");
        }
    }

    static boolean pertenceFibonacci(int num) {
        if (num <= 1) {
            return num == 0;
        }
        int a = 0, b = 1;
        while (b < num) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return b == num;
    }
}
