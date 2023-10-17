    import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter the length of your array: ");
            int length = input.nextInt();
            int[] arr = new int[length];
            int i, j, temp;

            for (i = 0; i < length; i++) {
                System.out.print("Enter the value at index " + i + ": ");
                arr[i] = input.nextInt();
            }

            System.out.print("Your entered array is: [ ");
            for (i = 0; i < length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("]");
            try{
                for (i = 0; i < length; i++) {
                    for (j = 1; j < length; j++) {
                        if (arr[j - 1] > arr[j]) {
                            temp = arr[j - 1];
                            arr[j - 1] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }
            }
            catch(Exception e){
                System.out.println("An error occurred: " +e.getMessage());
            }

            System.out.print("Your entered array after sorting is: [ ");
            for (i = 0; i < length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("]");
            
            
            System.out.print(arr[length-1] + " Is the Greatest number in array ");
            System.out.println(arr[0] + " Is the Smallest number in array ");

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}
