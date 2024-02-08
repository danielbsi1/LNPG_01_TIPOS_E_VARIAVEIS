import java.util.Scanner;

public class Java_Atv_4 {
    public static void main(String[] args) {
        System.out.print("Olá, quantos anos você tem? ");
        Scanner leitor_1 = new Scanner(System.in);
        int idade = leitor_1.nextInt();
        if (idade >= 18) {
            System.out.println("Você é oficialmente maior de idade, que triste.");
        }
        else {
            System.out.println("Você é menor de idade, aproveita enquanto isso dura.");
        }
    }
}
