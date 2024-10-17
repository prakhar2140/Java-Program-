public class MergeSorting {
    public static void main(String[] args) {
        int arr[] = { 10, 8, 25, 45, 12, 36, 65, 19 };
        mergeSorting(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }

    static void mergeSorting(int arr[]) {
        int n = arr.length;
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int left[] = new int[mid];
        int right[] = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
        }

        mergeSorting(left);
        mergeSorting(right);
        merge(left, right, arr);
    }

    static void merge(int left[], int right[], int arr[]) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}