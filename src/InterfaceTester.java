import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class InterfaceTester {
    public static void main(String[] args) {
        System.out.println("Output 1: " + "zags".compareTo("apple")); // a 97 // A 65
        System.out.println("Output 2: " + "zags".compareTo("Zags"));
        System.out.println("Output 3: " + "zags".compareTo("zigs"));
        System.out.println("Output 4: " + "zags".compareTo("zags"));
        System.out.println("Output 5: " + "zags".equals("zags"));
        System.out.println("Output 6: " + "zags".equals("Zags"));
        Circle myCircle = new Circle();
        System.out.println("Output 7: " + myCircle.equals(myCircle));
        System.out.println("Output 8: " + new Circle().equals(new Circle()));
        /**
        What does compareTo() return when invoked with a String?
         0 when the invoking object is the same as the arg object
         < 0 the invoking object < arg object
         > 0 the invoking object > arg object
        When would you use compareTo()?
         sorting elements in a sequence, ordering 2 elements
        What does equals() return when comparing Strings? (VALUE comparison)
         a boolean... true when the contents of the strings are the same (when compareTo() returns 0)
         false otherwise
        What does equals() return when comparing Circles? (REFERENCE comparison)
         true when the Circle references refer to the same object
         false otherwise
        In general, what is the purpose of equals()? (tricky)
         Object's equals() compares two references to determine if they
         refer to the same object
         subclasses can override equals() to a value based comparison (like String)
         Note: do not use == to compare two strings... use equals()
        What happens when you try to run the following line of code (Output 9)? Any ideas for how to fix this so we can compare two Circle objects?
        */
        System.out.println("Output 9: " + myCircle.compareTo(myCircle));

        // Java provides a Comparable interface
        // interface: a set of methods a class can promise to implement

        // Comparable is a reference type (interfaces are reference types)
        Comparable myComparable = myCircle;

        // lets sort a Circle array
        Circle[] circles = new Circle[4];
        Random random = new Random();
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(i, i, random.nextDouble());
        }
        System.out.println(Arrays.toString(circles));
        Arrays.sort(circles);
        System.out.println(Arrays.toString(circles));

        // we can make our own interfaces!!
        Shape myShape = myCircle;
        // task: make a Rectangle that implements Shape
        // array of Shape references... for a polymorphism demo

    }
}
