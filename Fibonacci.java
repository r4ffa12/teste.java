import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um número");
        int numero = scanner.nextInt();

        if (verificarFibonnaci(numero)) {
            System.out.println(numero + " é da sequência");     
        } else {
            System.out.println(numero + " não é da sequência");
        }

        scanner.close();
    }

    public static boolean verificarFibonnaci(int num){
        int a = 0;
        int b = 1;

        while (a <= num) {
            if (a == num) {
                return true;
            }
            int temp = a;
            a = b;
            b = temp + b;
        }

        return false;
    }
}
