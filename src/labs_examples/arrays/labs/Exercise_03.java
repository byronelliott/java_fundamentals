package labs_examples.arrays.labs;

/**
 * 2D Array
 * <p>
 * Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 * <p>
 * The output should look something like this:
 * <p>
 * 3 6 9 12 15
 * 18 21 24 27 30
 * ...
 * ...
 * ...
 */

public class Exercise_03 {

    public static void main(String[] args) {

        int[][] twoDArray = new int[5][5];
        int count = 3;
        // use 2 for loops to populate the 2d array
        for (int i = 0; i < twoDArray.length ; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = count;
                count+=3;
            }
        }

        for (int[] outer : twoDArray) {
            for (int inner : outer){
                System.out.print(inner + "|");
            }
            System.out.println();
        }

    }
}
