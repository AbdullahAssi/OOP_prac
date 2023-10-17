import java.util.Scanner;
class Sort {
    public static void sort(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < rows; k++) {
                    for (int l = 0; l < cols; l++) {
                        if (arr[i][j] < arr[k][l]) {
                            int temp = arr[i][j];
                            arr[i][j] = arr[k][l];
                            arr[k][l] = temp;
                        }
                    }
                }
            }
        }
    }
}
public class mutli {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sort obj1 = new Sort();
        try {
            System.out.println("Enter the number of rows: ");
            int rows = input.nextInt();
            System.out.println("Enter the number of columns: ");
            int cols = input.nextInt();
            int[][] arr = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.println("Enter the element at row " + i + ", column " + j + ": ");
                    arr[i][j] = input.nextInt();
                }
            }

            System.out.println("Array before sorting: ");
            for (int[] row : arr) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }

            obj1.sort(arr);

            System.out.println("\nArray after sorting: ");
            for (int[] row : arr) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

