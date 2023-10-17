import java.util.Scanner;

class Sort {
    public static void sort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < (length - 1); j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

public class sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sort obj1 = new Sort();
        try {
            System.out.println("Enter the length of the array: ");
            int length = input.nextInt();
            int[] arr = new int[length];
            for (int i = 0; i < length; i++) {
                System.out.println("Enter the element at index " + i + ": ");
                arr[i] = input.nextInt();
            }

            System.out.println("Array before sorting: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }

            obj1.sort(arr);

            System.out.println("\nArray after sorting: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
