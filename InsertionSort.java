public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 12, 5, 9, 8, 7, 14, 52, 36, 45 };
        insertionSort(arr);
    }

    static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("Elemetn after sorting ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
