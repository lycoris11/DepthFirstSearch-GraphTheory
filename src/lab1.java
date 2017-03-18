import java.io.File;
import java.io.FileNotFoundException;
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
    private static void depthFirstSearch(int[] v, int[][] a, int i) {

        v[i] = 1;
        System.out.print(" " + Math.addExact(i, 1));

        for (int j = 0; j < a[i].length; j++) {
            if (a[i][j] == 1) {
                if (v[j] == 0) {
                    depthFirstSearch(v, a, j);
                }
            }
        }
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        File file = new File("data1.txt");

        try {
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //do {
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        int[] vList = new int[n];
        in.nextLine();

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

        int numComponents = 1;
        System.out.print("Component:");
        depthFirstSearch(vList, arr, 0);

        for (int k = 0; k < vList.length; k++) {
            if (vList[k] == 0) {
                numComponents++;
                System.out.println();
                System.out.print("Component:");
                depthFirstSearch(vList, arr, k);
            }
        }

        System.out.println();
        System.out.print("Total number of Components: " + numComponents);

        //} while (in.hasNextLine());

        in.close();
    }

}
