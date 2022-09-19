package basics;

import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {

        // Napravi program koji ce da skenira broj artikala koji unesemo i sabere koliki je zbir.

        System.out.println("How many articles do you have?");
        Scanner input = new Scanner(System.in);
        int quantity = input.nextInt();
        int price;
        int total = 0;
        for (int i=1; i<=quantity; i++){
            System.out.println("What is the price of " + i + " article?");
            price = input.nextInt();
            total += price;
        }
        System.out.println("Total price is :" + total + "USD");


        int number = 15;
        for (int i = 1; i <= number; i++) {
            System.out.println("This is attempt number " + i);
        }



    }}


