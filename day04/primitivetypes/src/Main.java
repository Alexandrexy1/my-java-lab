//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // tipos primitivos não alocam endereço na mémoria heap
        double x, y;

        // x recebe na memória stack o valor 10
        x = 10;
        System.out.println(x);

        // y vira uma cópia de x, não endereçando para o mesmo valor
        y = x;
        System.out.println(y);

        // y troca de valor, sem trocar também o valor de x
        y = 70;
        System.out.println(y);
    }
}