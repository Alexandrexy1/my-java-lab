package day02.inputtools;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1, number2, sum;

        System.out.print("Enter first integer: ");
        number1 = sc.nextInt();

        System.out.print("Enter the second integer: ");
        number2 = sc.nextInt();

        sum = number1 + number2;

        System.out.printf("Sum is %d%n", sum);

    }
}
