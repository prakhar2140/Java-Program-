// WAP  to implement the bitonic array And also find minimu element and peak element in the bitonic Array
class BitonicArray {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 9, 7, 5, 3, 1 };
        minElement(arr);
        int index = findPeakElement(arr);
        if (index == -1) {
            System.out.println("ELement not found ");
        } else {
            System.out.println("Elelment found at " + index);
        }

    }

    // WAP to find out peak element in the array
    static int findPeakElement(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int next = (mid + 1) % arr.length;
            int prev = (mid - 1 + arr.length) % arr.length;

            if (arr[mid] > arr[prev] && arr[mid] > arr[next]) {
                return mid;
            } else if (arr[mid] > arr[prev]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // WAP to find minimum element in the bitonic array
    static void minElement(int arr[]) {
        if (arr.length == 0) {
            System.out.println("Array is empty ");
        } else if (arr.length == 1) {
            System.out.println("Their is only element in the array so ans is " + arr[0]);
        } else {
            int res = (arr[0] < arr[arr.length - 1]) ? arr[0] : arr[arr.length - 1];
            System.out.println("Minimum element is " + res);
        }
    }

    // WAP to search a element in the bitonic array
    static void searchingBitonicArray(int arr[], int target) {

    }
}
