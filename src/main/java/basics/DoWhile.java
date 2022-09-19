package basics;

import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
// Napravi program koji ce traziti od usera da unese dva broja i onda ih sabere.

        boolean answer;
        Scanner input = new Scanner(System.in);
                do {
                    System.out.println("Insert first number:");
                    int prviBroj = input.nextInt();
                    System.out.println("Insert second number:");
                    int drugiBroj = input.nextInt();
                    System.out.println(prviBroj + drugiBroj);
                    System.out.println("Do you want to continue?");
                    answer = input.nextBoolean();
                } while (answer); {
                    System.out.println("Zadatak zavrsen.");
        };
                    input.close();

    }
}
