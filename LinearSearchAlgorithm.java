// WAP to implement the linear search Algorithm 
public class LinearSearchAlgorithm {
    public static void main(String[] args) {
        int arr[] = { 589, 89, 78, 60, 23, 589, 589 };
        searching(arr, 23);
        maxElement(arr);
        linearSearchMultiple(arr, 589);

    }

    static void searching(int arr[], int target) {
        int loc = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                loc = i;
                System.out.println("The location of the targeted element is " + loc);
                break;
            }
        }
        if (loc == 0) {
            System.out.println("Targeted element is not in the list");
        }
    }

    // Write a method to find the largest element in the array using linear search
    // Algorithm
    static void maxElement(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element of the array is " + max);

    }

    static void linearSearchMultiple(int arr[], int target) {
        int ans[] = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans[k] = i;
                k++;
            }
        }
        if (k == 0) {
            System.out.println("Element not found ");
        } else {
            for (int i = 0; i < k; i++) {
                System.out.println("INdex of the reapeated element " + ans[i]);
            }
            System.out.println();
        }
    }

    // WAP to find maximum subarray of the given array

    static void findMaximumSumSubArray(int arr[][]) {
        int max = Integer.MIN_VALUE;
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            if (sum > max) {
                max = sum;
                res = i;
            }
        }
        System.out.println("Maximum sum subarray is :" + max + ", for the index" + res);

    }
    // WAP to find min subarray

    static void findMinimumSubarray(int arr[][]) {
        int min = Integer.MIN_VALUE;
        int res;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            if (min < sum) {
                min = sum;
                res = i;
            }
        }
        System.out.println("Maximum sum subarray is :" + min + ", for the index" + res);

    }

}
