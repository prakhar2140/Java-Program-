
// WAP to implemment 2-D Array in the java Programming 
import java.util.*;

public class Array2D {
    public static void main(String[] args) {
        // Taking input in the 2-D array by the user
        int a[][] = new int[5][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("Enter " + i + " element of " + j + ":");
                int element = sc.nextInt();
                a[i][j] = element;
            }
        }
        // Priting the array
        printingArray(a);
    }

    // Create a method to print the array
    static void printingArray(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
                if (j != a[i].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }

    static void insert(int arr[], int pos, int element) {

        int size = arr.length;
        if (pos < 0 || pos > size - 1) {
            System.out.println("Wrong position");
            return;
        }
        // shifting towards the end
        for (int i = size - 2; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = element;
    }

    // Insertion of the element at any specific position in the 2-D Array
    static void insertionElement(int a[][], int pos1, int pos2, int element) {
        insert(a[pos1], pos2, element);

    }

    // Deletion of the elment from any specific postion given from the 2-D Array
    static void delete2dArray(int arr[][], int pos1, int pos2) {
        deletion(arr[pos1], pos2);
    }

    static void deletion(int arr[], int pos) {
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
