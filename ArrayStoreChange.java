import java.util.Scanner;

public class ArrayStoreChange {
     static void change(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 10;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[5];

        System.out.println("Enter 5 elements in the array");
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }

        System.out.println("Array before chnange:");
        for (int element : num) {
            System.out.print(element +" ");
        }

        change(num);
        System.out.println();
        System.out.println("Array after adding 10:");
        for (int element : num) {
            System.out.print(element + " ");
        }
    }

   
}
