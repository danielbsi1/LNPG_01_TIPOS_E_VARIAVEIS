import java.util.Scanner;

public class Java_Atv_3 {
    public static void main(String[] args) {
        System.out.print("Digite a temperatura em Celsius: ");
        Scanner leitor1 = new Scanner(System.in);
        float temp_Celsius = leitor1.nextFloat();
        float fahrenheit = (temp_Celsius * 9/5) + 32;
        System.out.println("A temperatura convertida é " + fahrenheit + "°F");
    }
}
