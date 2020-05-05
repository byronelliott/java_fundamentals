package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        System.out.println("Multiplication : " + multiply(3, 4));
        System.out.println("Division : " + divide(15, 5));
        System.out.println(joke());
        System.out.println("You are " + yearSecond(45) + " seconds old!!!");
        System.out.println("Length of the array is : " + varargs(3, 6, 5, 7, 34, 52));
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b) {
        return a * b;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b) {
        return a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static String joke() {
        return "This is Ridiculous";
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents

    public static int yearSecond(int years) {
        return years * 86400;
    }
    // 5) Create a varargs method that will return the length of the varargs array passed in

    public static int varargs(int... a) {
        int count = 0;
        for (int i : a) {
            count++;
        }
        return count;
    }
}
