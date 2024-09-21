// Wap to implement the Selection sort in java programming
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 14, 25, 56, 10, 2, 45, 89, 23 };
        selectionSort(arr);
    }

    static void selectionSort(int arr[]) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
