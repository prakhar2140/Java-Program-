// Wap  to implement the brick sort in java programming 
public class BrickSort {
    public static void main(String[] args) {
        int arr[] = { 4, 10, 2, 56, 45, 78, 20, 24 };
        brickSorting(arr);
    }

    static void brickSorting(int arr[]) {
        int n = arr.length;
        boolean flag;
        int temp = 0;
        while (true) {
            flag = false;
            for (int i = 0; i <= n - 2; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = true;
                }
            }
            for (int i = 1; i <= n - 2; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = true;
                }
            }

            if (!flag) {
                break;
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
