import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Tamanho do vetor: ");
        int n = sc.nextInt();

        Product[] products = new Product[n];

        for (int i = 0; i < products.length; i++) {
            System.out.print("Nome do produto: ");
            String name = sc.nextLine(); // TV, Ar-condicionado, Geladeira
            sc.next();

            System.out.print("Preço do produto: ");
            double price = sc.nextDouble(); // 900, 400, 800

            products[i] = new Product(name, price);
        }

        double total = 0;

        for (Product product: products) {
            total += product.getPrice();
        }

        double averagePrice = total / products.length;


        System.out.printf("Preço médio dos produtos: R$ %.2f%n", averagePrice); // R$ 700.00

        sc.close();
    }
}