package basics;


import java.util.Scanner;

public class PractiseClass {
    public static void main(String[] args) {
/*
        // Check if user is adult
        System.out.println("How old are you?");
        Scanner input = new Scanner(System.in);
        int yearOfBirth = input.nextInt();
        if (yearOfBirth>=18){
            System.out.println("User is adult.");
        } else {
            System.out.println("User is minor.");
        }

        //Check leap year - if yes is leap - if not is regular / year divisible by 4 or 400, not with 100
        System.out.println("What year is it?");
        int leapYear = input.nextInt();

        if (leapYear %4 == 0 && (leapYear %100 != 0) || leapYear %400 == 0 ){
            System.out.println("Year is leap.");
        } else {
            System.out.println("Year is not leap.");
        }
        */
        //Number of students

        System.out.println("How many students?");
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();
        int numberOfPoints;
        int passed = 0;
        int failed = 0;
        for (int i=1;i<=numberOfStudents;i++) {
            System.out.println("How many points did you have?");
            numberOfPoints = input.nextInt();
            if (numberOfPoints>60){
                System.out.println("Good job!");
                passed += 1;
            } else {
                System.out.println("Study more!");
                failed += 1;
            }
        }
        System.out.println("Number of students that have passed is: " + passed + " and number of students that have failed is: " + failed);


    }
}
