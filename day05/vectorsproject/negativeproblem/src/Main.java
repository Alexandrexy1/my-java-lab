import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int quantity = sc.nextInt();

        int[] vector = new int[quantity];

        for (int i = 0; i < quantity; i++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();

            vector[i] = num;
        }

        System.out.println("Números negativos");
        for (int num : vector) {
            if (num < 0) {
                System.out.println(num);
            }
        }

        sc.close();
    }
}