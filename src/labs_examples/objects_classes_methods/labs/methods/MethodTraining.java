package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodTraining {
    public static void main(String[] args) throws InterruptedException {

//        2)
        int m1 = 20;
        int m2 = 14;
        passByValue(m1, m2);

        Person byron = new Person("Byron", 45);
        System.out.println(byron.toString());
        passByReference(byron);
        System.out.println(byron.toString());
//        3)
        largestNum(45, 65, 89, 120);
//        4)
        String con = "Check this out and see if it works!!!!!!!";
        System.out.println("'" + con + "'" + " : has " + consonants(con) + " consonants!");
//        5)
        asciiArt();
//        6)
        primeNumber(45);
//        7)
        int[] a = {23, 45, 12, 456, 27};
        Arrays.sort(a);
        System.out.println("Numbers lowest to highest : " + Arrays.toString(a));
//        8)
        ArrayList<Integer> x = arrayList(4678, 12, 6);
        System.out.println(x);
        System.out.println("Numbers in arraylist : " + x.size());
//        9)
        int[] num = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverseArray(num);
        reverseArray(a);
    }

    //    1) Demonstrate method overloading in this class
    public static class Person {
        public String first;
        public String last;
        public int age;

        public Person() {
        }

        public Person(String first, String last) {
            this.first = first;
            this.last = last;
        }

        public Person(String first, int age) {
            this.first = first;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "first='" + first + '\'' +
                    ", last='" + last + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    //    2) Demonstrate the difference between "pass by value" and "pass by reference"
    public static void passByValue(int a, int b) {
        a = a * 300;
        b = b * 120;
        System.out.println(a);
        System.out.println(b);
    }
    public static void passByReference(Person person){
        person.age = person.age + 1;
    }

    //    3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
    public static void largestNum(int a, int b, int c, int d) {

        if (a > b && a > c && a > d) System.out.println("int 'a' is the biggest number");
        if (b > a && b > c && b > d) System.out.println("int 'b' is the biggest number");
        if (c > a && c > b && c > d) System.out.println("int 'c' is the biggest number");
        else System.out.println("int 'd' is the biggest number");
    }

    //    4) Write a method to count all consonants (the opposite of vowels) in a String
    public static int consonants(String str) {
        int count = 0;
        String string = str.replaceAll("[aAeEiIoOuU\\s+\\W+]", "");
        String s = string.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length()) {
                count++;
            }
        }
        return count;
    }

    //    5) Write a method that will print some kind of ascii art to the console (Google "ascii art" if needed)
    public static void asciiArt() throws InterruptedException {
        System.out.print("_o______");
        Thread.sleep(1000);
        System.out.print("_o__");
        Thread.sleep(1000);
        System.out.print("____o_");
        Thread.sleep(1000);
        System.out.println("_O|");
        Thread.sleep(1000);

        System.out.println("|__        __    __    __");
        Thread.sleep(1000);
        System.out.println("|__| |__| |     |__|  |  |");
        Thread.sleep(1000);
        System.out.println("________|_________________");
        Thread.sleep(1000);
    }

    //    6) Write a method that will determine whether or not a number is prime
    public static void primeNumber(int num) {
        boolean prime = true;
        int temp;
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                prime = false;
                break;
            }
        }
        if (prime) System.out.println(num + " is a prime number");
        else System.out.println(num + " is not a prime number");
    }

    //    7) Write a method that will return a small array containing the highest to lowest numbers in a given numeric array,
//    which is passed in as an argument
    public static void sort(int[] a) {

    }

    //    8) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
//    In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
//    divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
//    length of the returned list
    public static ArrayList<Integer> arrayList(int maxNum, int divisor1, int divisor2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= maxNum; i++) {
            if (i % divisor1 == 0 && i % divisor2 == 0) {
                list.add(i);
            }
        }
        return list;
    }

    //    9) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
//    instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
//    variable is used to temporarily store individual values in the array

    public static void reverseArray(int num[]) {
        int temp = 0;
        for (int i = 0; i < num.length / 2; i++) {
            if (i < num.length / 2) {
                temp = num[i];
                num[i] = num[(num.length - i) - 1];
                num[(num.length - i) - 1] = temp;
            }
        }
        System.out.println("This is the reverse of your array : " + Arrays.toString(num));
    }


}
