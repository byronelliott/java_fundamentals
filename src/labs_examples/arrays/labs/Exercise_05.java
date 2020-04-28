package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        int count = 0;
        int[] num = new int[7];
        for (int i = 0; i < num.length ; i++) {
            num[i] = count;
            count++;
        }
        for (int i = num.length-1; i >= 0 ; i-=2) {
            System.out.println(num[i]);
        }
    }
}
