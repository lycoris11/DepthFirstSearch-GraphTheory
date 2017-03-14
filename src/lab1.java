import java.util.Scanner;

/**
 * Uses the DFS algorithm on adjacency matrices to output the connected
 * components of an undirected simple graph as well as the total number of
 * components.
 *
 * @author Mark Pinto
 *
 */
public final class lab1 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private lab1() {
    }

    /**
     * Runs my implementation of the DepthFirstSearch Algorithm on a 2D array.
     */
    private static void depthFirstSearch() {

    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //do {
        int n = in.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String rowEntry = in.nextLine();

            //Populates 2d Array
            int pos = 0;
            for (int k = 0; k < rowEntry.length(); k++) {
                char c = rowEntry.charAt(k);
                if (Character.isDigit(rowEntry.charAt(k))) {
                    arr[i][pos] = Character.getNumericValue(c);
                    pos++;
                }
            }
        }

        //} while (in.hasNextLine());

        in.close();
    }

}
