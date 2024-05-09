import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2darray {
    public static void main(String[] args) {

        int col, row, key;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of row: ");
        row = sc.nextInt();
        System.out.println("Enter size of column: ");
        col = sc.nextInt();
        int[][] a = new int[row][col];
        System.out.println("Enter elements of 2D array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
//sorting 2d array
        for (int[] rowArr : a) {
            Arrays.sort(rowArr);
        }

        System.out.println("Enter key to be found:");
        key = sc.nextInt();
        if (findnum(a, key, row)) {
            System.out.println("Element is present in the array.");
        } else {
            System.out.println("Element is not present in the array.");
        }
    }

    public static boolean findnum(int[][] a, int key, int row) {
        for (int i = 0; i < row; i++) {
            if (isfind(i, a, key)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isfind(int i, int[][] a, int key) {
        int[] matrix = a[i];
        int first = 0;
        int last = matrix.length - 1;

        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (matrix[mid] == key) {
                return true;
            } else if (key > matrix[mid]) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return false;
    }
}
