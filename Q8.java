import java.util.*;

class customException extends Exception {

    @Override
    public String getMessage() {
        return "Cannot put string in input";
    }

}

class GenericClass {

    public <T> void genericFunction(T... args) {
        int itemsToPrint = (args.length * 2) / 3;
        try {

            // Check the types of arguments passed in
            for (T i : args) {
                if (i instanceof String) {
                    throw new customException();
                }
            }

            // If the type checking test is passed, then print 2/3 of the values
            for (int i = 0; i <= itemsToPrint; i++) {
                System.out.println(args[i]);
            }
        } catch (customException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Q8 {

    Q8() {
        GenericClass generic = new GenericClass();

        // to test exception handling
        generic.genericFunction(5, "val", 4, 6);

        // to test printing
        generic.genericFunction(9, 2, 3);

    }

    public static void main(String[] args) {
        Q8 test = new Q8();
    }

}