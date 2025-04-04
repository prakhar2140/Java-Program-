import java.util.Scanner;

public class EvenIndices {
    public static void main(String[] args) {
        // int arr[] = { 10, 20, 30, 40, 50 };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }

        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }
    }
}
// Next is used fpr take input without spaces
// The correct way to read a array is array of function returning method
// returninig method of ,Object of ,Pointer to ,Reference to
// sc is reference to scanner object why is object beacause their is new keyword
// which makes
