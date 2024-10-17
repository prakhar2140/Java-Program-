public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 10, 14, 22, 8, 13, 25, 1 };
        quickSort(arr, 0, arr.length - 1);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i == n) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }

    static int partitioning(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }

        }
        swap(arr, low, j);
        return j;
    }

    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pIndex = partitioning(arr, low, high);
            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
