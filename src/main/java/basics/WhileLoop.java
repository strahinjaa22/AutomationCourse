package basics;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        /*
        int number=3;
        while (number<=10){
            System.out.println(number + " is smaller or equal to 10." );
            number++;
        }*/

        int maxHours=40;
        int hourRate=45;
        int gross;
        System.out.println("How many hours did you work last week?");
        Scanner input = new Scanner(System.in);
        int hours = input.nextInt();

        while (hours>maxHours){
            System.out.println("Invalid number");
            hours =input.nextInt();
        }
        System.out.println("Your salary is " + (gross=hours*hourRate));







    }
}
