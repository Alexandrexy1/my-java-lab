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

        double[] vector = new double[quantity];
        double total = 0;

        for (int i = 0; i < quantity; i++) {
            System.out.print("Digite um número: ");
            vector[i] = sc.nextInt();
        }

        System.out.println("valores: ");
        for (double num: vector) {
            System.out.println(num);
            total += num;
        }

        double average = total / vector.length;
        System.out.println("Total: " + total);
        System.out.println("Média: " + average);
    }
}