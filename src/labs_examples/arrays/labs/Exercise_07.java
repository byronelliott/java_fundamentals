package labs_examples.arrays.labs;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("This");
        list.add("is");
        list.add("going");
        list.add("to");
        list.add("be");
        list.add("interesting");

        System.out.println(list);

        list.add(2, "not");
        System.out.println(list);

        System.out.println("Is this list empty : " + list.isEmpty());

        for (String i : list) {
            System.out.println(i);
        }

        System.out.println("This is the first index of 'is' : " + list.indexOf("is"));

    }
}
