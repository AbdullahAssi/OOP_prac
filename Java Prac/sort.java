import java.util.Scanner;
class sortm{
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
public class sort{
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        sortm obj1 = new sortm();
        try{
            System.out.println("Enter the length of the array: ");
            int length = input.nextInt();

            int[]arr = new int[length];

            for(int i =0 ; i<length ; i++){
                System.out.println("Enter the element at of array: ");
                arr[i]= input.nextInt();

            }

            for(int num: arr){
                System.out.print(" "+num);
            }
            
            obj1.sort(arr);
            
            System.out.println("\nEnter array after sorting:");
             for(int i =0 ; i<length ; i++){
                System.out.print(arr[i]);
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
