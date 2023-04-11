package misc;

public class MultiplicationTable {
    /**
     * Main method
     */
    public static void main(String[] args) {
        // Display the table heading
        System.out.println("         Multiplication Table");

        // Display the number title
        System.out.print("    ");
        for (int j = 1; j <= 9; j++)
            System.out.printf("%4d", j);
        System.out.println("\n — — — — — — — — — — — — — — — — — — — —");

        // Display table body
        for (int i = 1; i <= 9; i++) { // rows or lines
            System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++) { // columns
                // Display the product and align properly
                System.out.printf("%4d", i * j); // print a decimal integer 4-chars wide
            }
            System.out.println();
        }
    }

    public static int[][] buildTable(int size) {
        // TODO create an empty array to hold the table
        // COMMON PROBLEM WITH ARRAYS
        //   indexes start at ZERO, not ONE
        //   Three basic solutions:
        //      - subtract from the number to get the index for lookup
        //      - add one to the index to get the number
        //      * don't use index zero at all, make table one size larger in both rows and cols
        int[][] table = new int[size+1][size+1]; // ignoring slots 0
        // TODO use nested for-loops to fill-in a two-dimensional array
        for (int i = 1; i <= 9; i++) { // rows
            for (int j = 1; j <= 9; j++) { // columns
                table[i][j] = i * j; // store the product in the appropriate cell of the table
            }
        }
        // TODO return the 2D array
        return table;
    }
}