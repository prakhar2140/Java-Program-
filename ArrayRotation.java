// Rotate a array in right direction 
public class ArrayRotation {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 2;
        for (int i = 0; i < k; i++) {
            int last;
            last = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nRotation left ");
        leftRotation(arr);
    }

    static void leftRotation(int arr[]) {
        int k = 2;
        int n = arr.length;
        k = k % n;

        for (int i = 0; i < k; i++) {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
