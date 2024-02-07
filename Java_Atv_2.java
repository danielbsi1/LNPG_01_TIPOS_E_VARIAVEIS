import java.util.Scanner;

public class Java_Atv_2 {
    public static void main(String[] args) {
        System.out.print("digite um número");
        Scanner leitor1 = new Scanner(System.in);
        int numero = leitor1.nextInt();
        if (numero % 2 == 0) {
            System.out.println(numero + " é um número par");
            
        }
        else {
            System.out.println(numero + " é um número impar");
        }

    }
}
