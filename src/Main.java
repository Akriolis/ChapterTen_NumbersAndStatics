import java.rmi.MarshalException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // static in Java

        int test  = 63;
        System.out.println(Math.abs(test));

        // the keyword static lets a method run without
        // any instance of the class

        // it's like say "behavior not dependent on an instance variable,
        // so no instance/object is required"

        /*Duck myDuck = new Duck();
        Duck myDuck2 = new Duck();
        Duck myDuck3 = new Duck();
        System.out.println(myDuck3.getDuckCount());*/

        Duck.myDuck.setSize(10);

        // static variables in a class initialized before any object of that class can be created
        // and before any static method of the class runs

        System.out.println(Duck.myDuck.getDuckCount());

        Duck testDuck = new Duck("Bibip");

        System.out.println(Duck.myDuck.getDuckCount());

        // all static variables in a class initialized before
        // any object of that class can be created

        // final keyword
        // a variable marked final means that - "once initialized, never change"

        // a final variable means you can't change its value
        // a final method means you can't override the method
        // a final class means you can't extend the class (i.e. you can't make a subclass)

        // Math.abs() returns the absolute value of an argument
        int x = Math.abs(-240);
        double d = Math.abs (240.45);

        // Math.random() returns a double between (and including ) 0.0
        // and 1.0 (but not including)

        int randomIntNumber = (int) (Math.random() * 5);

        // also, java.util.Random can be used
        Random myRandom = new Random();
        myRandom.nextInt(0, 5);

        // Math.round()
        // returns an int or a long (if argument is a float or a double)

        int x1 = Math.round(-24.8f); //returns -25
        int y1 = Math.round(24.4f); //returns 24

        long z = Math.round(24.45); // returns 24l

        // Math.min() returns a minimum of the two passed arguments

        int x2 = Math.min(24,240); // returns 24

        // Math.max() returns a maximum of the two passed arguments

        int x3 = Math.min(24,240); // returns 240

        // Math.sqrt() returns the positive square root of the argument

        double x4 = Math.sqrt(9); // return 3

        // When you need to treat a primitive like an object, wrap it

        int i = 40;
        Integer wrappedI = i; // same as = new Integer(i);
        System.out.println(wrappedI.intValue());

        // treating primitives like an objects

        Boolean isTrue = true;
        boolean isFalse = false;

        Integer x6 = 50;

        int testInt = x6;

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(i);
        myList.add(x6);
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));

        // Java compile automatically treats int like Integer due to autoboxing

        Duck.myDuck.go();

        Integer a = 1;
        Integer b = 2;
        int c = 3;

        System.out.printf("this is %d and %d and %d", a, b, c);
        System.out.println();
        System.out.println(String.format("this is %d and %d and %d number 2", a, b, c));

        long myBillion = 1_000_000_000;
        System.out.println(String.format("%,d", myBillion));

        int one = 20_456_654;
        double two = 100_567.249;
        String s = String.format("The rank is %,d of %,.2f", one, two);
        System.out.println(s);

        /*
        1. false
        2. false
        3. true
        4. true / false
        5. true
        6. false
        7. true
        8. false / true
        9. false
        10. false
        11. false
        12. true
        13. false
        14. false
         */

    }
}
