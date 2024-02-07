import java.util.Scanner;

public class Java_Atv_1 {

    public static void main(String[] args) {
        System.out.print("Olá, digite o primeiro número que será usado:");
        Scanner leitor_1 = new Scanner(System.in);
        int numero_1 = leitor_1.nextInt();
        System.out.print("Ótimo, agora digite o segundo número:");
        Scanner leitor_2 = new Scanner(System.in);
        int numero_2 = leitor_2.nextInt();
        System.out.println("A soma entre esse dois numeros é igual à = " + (numero_1  + numero_2));
        System.out.println("A diferença entre esse dois numeros é igual à = " + (numero_1  - numero_2));
        System.out.println("A multiplicação entre esse dois numeros é igual à = " +  numero_1  * numero_2);
        System.out.println("A divisão entre esse dois numeros é igual à = " + numero_1  / numero_2);
    }
}