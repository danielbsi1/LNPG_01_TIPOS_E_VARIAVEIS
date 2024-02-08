import java.util.Scanner;

public class Java_Atv_5 {

    public static void main(String[] args) {
        System.out.print("Digite a primeira nota: ");
        Scanner leitor_nota_1 = new Scanner(System.in);
        float nota_1 = leitor_nota_1.nextFloat();
        System.out.print("Qual é o peso dessa nota? ");
        Scanner leitor_peso_1 = new Scanner(System.in);
        float peso_1 = leitor_peso_1.nextFloat();
        //
        System.out.print("Digite a segunda nota: ");
        Scanner leitor_nota_2 = new Scanner(System.in);
        float nota_2 = leitor_nota_2.nextFloat();
        System.out.print("Qual é o peso dessa nota? ");
        Scanner leitor_peso_2 = new Scanner(System.in);
        float peso_2 = leitor_peso_2.nextFloat();
        //
        System.out.print("Digite a terceira nota: ");
        Scanner leitor_nota_3 = new Scanner(System.in);
        float nota_3 = leitor_nota_3.nextFloat();
        System.out.print("Qual é o peso dessa nota? ");
        Scanner leitor_peso_3 = new Scanner(System.in);
        float peso_3 = leitor_peso_3.nextFloat();
        //
        System.out.println("A sua nota final é " + ((nota_1 * peso_1 + nota_2 * peso_2 + nota_3 * peso_3) / (peso_1 + peso_2 + peso_3)));
    }
}