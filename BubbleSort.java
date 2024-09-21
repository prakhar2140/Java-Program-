// Wap to implement the bubble sort using java on array 
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 13, 45, 10, 8, 20, 49, 87 };
        bubbleSorting(arr);
    }

    static void bubbleSorting(int arr[]) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }

        }
    }
}
