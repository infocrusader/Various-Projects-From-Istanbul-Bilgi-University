package scanner;

import java.util.Scanner;

public class Main {

    public static void acceptValidInput(Scanner sc) {

        int i = sc.nextInt();

        if (i <= 10) {
            System.out.print("Enter a number greater than 10: ");

            acceptValidInput(sc);
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter a number greater than 10: ");
        Scanner sc = new Scanner(System.in);

        acceptValidInput(sc);
        sc.close();

        System.out.println("Your input is valid");
    }
}