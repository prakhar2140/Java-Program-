import java.util.Scanner;

public class ArrayOpr {

    public static void main(String[] args) {

        // Taking input in the array list
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + i + " element: ");
            int element = sc.nextInt();
            arr[i] = element;

        }
        printingArray(arr);
        insertion(arr, 4, 10);
        printingArray(arr);
        deletion(arr, 3);
        printingArray(arr);
    }

    // Printing the array
    public static void printingArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
    // Insertion of element at the end of the array time complexity is O(1)
    // So the time complexity for insertion at begining in the aray is O(n)
    // The time complexity for insertion at any ith position in array is O(n-1-i)

    public static void insertion(int arr[], int pos, int element) {
        int size = arr.length;
        if (pos < 0 || pos > size) {
            System.out.print("Wrong index");
            return;
        }
        // Insertion at any specific position
        for (int i = size - 2; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = element;
    }

    // Deletion at any specific position
    public static void deletion(int arr[], int pos) {
        int size = arr.length;
        if (pos < 0 || pos > size) {
            System.out.print("Wrong index");
            return;
        }
        for (int i = pos; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

}
