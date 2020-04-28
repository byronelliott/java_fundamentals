package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 * <p>
 * Take in a word from the user and using a "while" loop, find the first vowel in the word.
 * Once you find the vowel, print out the word and the first vowel.
 * <p>
 * Hints:
 * - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 * - you'll likely want to use a String that contains all the vowels:
 * - ie: String vowels = "aeiou";
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("--Please type a word--");
        String word1 = in.nextLine();
        String word = word1.toLowerCase();
        int i = 0;

        while (i < word.length()) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                System.out.println("'" + word.charAt(i) + "'" + " is the first vowel in " + word);
                break;
            } else {
                i++;
            }
        }


    }
}
