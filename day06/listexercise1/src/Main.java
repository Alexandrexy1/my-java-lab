import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Alex");
        list.add("Anna");
        list.add("Mario");
        list.add("Joao");
        list.add("Mateus");
        list.add("Guilherme");
        list.add("Miranda");
        list.add(2, "Marcos");

        List<String> newList = list.stream().filter(x -> x.charAt(0) == 'M').toList();

        String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);

        list.removeIf(x -> x.charAt(0) != 'A');

        for (String x: list) {
            System.out.println(x);
        }

        for (String x: newList) {
            System.out.println(x);
        }

        System.out.println("name with first letter starting with M: " + name);
    }
}