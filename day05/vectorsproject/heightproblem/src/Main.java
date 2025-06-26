import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int quantity = sc.nextInt();

        Person[] people = new Person[quantity];

        for (int i = 0; i < quantity; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            sc.nextLine();

            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Idade: ");
            int age = sc.nextInt();

            System.out.print("Altura: ");
            double height = sc.nextDouble();

            people[i] = new Person(name, age, height);
        }

        double totalHeight = 0;
        int countUnder16 = 0;

        for (Person person: people) {
            totalHeight += person.getHeight();

            if (person.getAge() < 16) {
                countUnder16 += 1;
            }
        }

        double averageHeight = totalHeight / people.length;
        double peopleUnder16Percentage = ((double) countUnder16 / people.length) * 100;

        System.out.println("Altura média: " + String.format("%.2f", averageHeight));
        System.out.println("Pessoas abaixo de 16 anos: " + String.format("%.2f", peopleUnder16Percentage) + "%");

        for (Person person: people) {
            if (person.getAge() < 16) {
                System.out.println(person.getName());
            }
        }

        sc.close();
    }
}