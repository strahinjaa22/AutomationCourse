package basics;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        char grade;
        System.out.println("What is your number of points?");
        Scanner input = new Scanner(System.in);
        double points = input.nextDouble();
        input.close();

        if (points<60){
            grade='F';
        } else if (points<70){
            grade='D';
        } else if (points<80){
            grade='C';
        } else if (points<90){
            grade='B';
        } else {
            grade='A';
        }
        System.out.println("Your grade is " + grade);

}
}

