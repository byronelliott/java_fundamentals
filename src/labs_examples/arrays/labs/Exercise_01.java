package labs_examples.arrays.labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 * <p>
 * Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 * calculate the sum of all of the numbers in the array as well as the average.
 * <p>
 * Print the results to the console.
 */

public class Exercise_01 {

    public static void main(String[] args) {

        int input;
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter a Number!");
        int sum = 0;

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] += s.nextInt();
        }
        for (int i : array){
            sum += array[i];
        }
        System.out.println("The total of your ten numbers = " + sum);
        System.out.println("The average of your numbers = " + (sum/10));

    }
    }
