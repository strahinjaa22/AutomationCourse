package basics;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        //IF-ELSE CONDITION


      /* // Napisati program koji ce provjeriti da li je uneseni broj paran ili neparan
       System.out.println("Insert a number:");
        Scanner scanner = new Scanner(System.in);
           int number = scanner.nextInt();
           scanner.close();
        if (number%2==0) {
            System.out.println("This number is even");
        } else {
            System.out.println("This number is odd!");
        } */

        int expectedSales = 10;
        System.out.println("How many sales did you have?");
        Scanner input = new Scanner(System.in);
        int sales = input.nextInt();
        input.close();

        if (sales > expectedSales){
            System.out.println("Bravo!");
        } else if (sales<expectedSales) {
            System.out.println("You can do better! You still have to make " + (expectedSales-sales) + " sales!");
        } else {
            System.out.println("Not great, not terrible!");
        }

    }
}
