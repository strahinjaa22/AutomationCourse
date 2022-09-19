package basics;

import java.util.Scanner;

public class NestedIfs {
    public static void main(String[] args) {
        // Da bi se kvalifikovao za pozajmicu osoba mora zaradjivati minimum 30k dolara i raditi u firmi min. 2 god.


        int minYears=2;
        int minSalary=30000;
        System.out.println("How much is your salary?");
        System.out.println("How many years have you been working here?");
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        int years = input.nextInt();
        input.close();

        if (minSalary<=salary) {
            if (minYears<=years) {
                System.out.println("You are qualified for this loan.");
                if (minSalary<=32000) {
                    System.out.println("We can give you maximum " + (2*salary) + "$");
                } else {
                    System.out.println("We can give you " + (salary+5000) + "$");
                }
            } else {
                System.out.println("You are not qualified. We require at least " + minYears + " of working experience");
            }
        } else {
            System.out.println("You are not qualified. You need at least " + minSalary + " for this loan!");
        }


    }
}
