package labs_examples.arrays.labs;

/**
 * Irregular Arrays
 * <p>
 * Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 * "for-each" loop, iterate and print out each element of the array.
 */

public class Exercise_04 {

    public static void main(String[] args) {

        String[][] names = new String[3][];
        names[0] = new String[2];
        names[1] = new String[3];
        names[2] = new String[4];

        names[0][0] = "Byron";
        names[0][1] = "Elliott";
        names[1][0] = "Heidi";
        names[1][1] = "Nancy";
        names[1][2] = "Alexander";
        names[2][0] = "Cosmo";
        names[2][1] = "Ella";
        names[2][2] = "Boo";
        names[2][3] = "Pippin";

        for (String[] outer : names) {
            for (String inner : outer) {
                System.out.print(inner + " ");
            }
            System.out.println();
        }
        System.out.println("------------");
        int count = 5;
        int[][] num = new int[3][];
        num[0] = new int[8];
        num[1] = new int[5];
        num[2] = new int[14];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = count;
                count += 5;
            }
        }
        for (int[] outer : num) {
            for (int inner : outer) {
                System.out.print(inner + " ");
            }
            System.out.println();
        }
    }
}
