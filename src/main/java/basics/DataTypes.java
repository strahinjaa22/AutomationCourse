package basics;

public class DataTypes {
    /*
    Primitive DataTypes:
    - int (cijeli broj, defaultna 0), *
    - short ,
    - byte (od -128 do 127 bytes),
    - double (decimalni broj do 16 decimala, default 0.0d), *
    - float (decimalni unlimited range),
    - char (1 slovo / 1 karakter - zauzima 2byte memorije), *
    - long (ogroman broj cifara, default 0),
    - boolean (true/false, defaultna false), *
    Non-primitive DataTypes:
    - string (array of characters()) -  ex. String stringName = "actual String",
    - array (group of same DataType []) - ex. String[] niz = ["s","t","r"],
    - class,
    - object
    - etc.
     */
    public static void main(String[] args) {
        boolean trueValue = true;
        double payment = 843.50;
        int years = 128;
        char firstLetter = 'A';
        int debt = -27640;

        double a = 5;
        double b = 10;
        double c = 10;
        double average = (a + b + c) / 3;
        System.out.println("Average is " + average);

        System.out.println("This is " +  trueValue);
        System.out.println("Your payement is " + payment);
        System.out.println("You are " + years + " years old.");
        System.out.println("Your name starts with letter " + firstLetter);
        System.out.println("You are left with " + debt +  "$");
    }
}
