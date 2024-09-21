// WAP to implement the binary search 
class BinarySearchALgorithm {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 2, 2, 2, 3, 3 };
        binarySearch(arr, 2, false);
        // int a = findAbsoluteDifference(arr, 56);
        // System.out.println(a);
    }

    static int binarySearch(int arr[], int target, boolean isFirst) {
        int Beg = 0;
        int ans = -1;
        int End = arr.length - 1;

        while (Beg <= End) {
            int mid = Beg + (End - Beg) / 2;
            if (arr[mid] == target) {
                ans = mid;
                System.out.println("Location of the element is " + ans);
                if (isFirst) {
                    End = mid - 1;
                } else {
                    Beg = mid + 1;
                }
            } else if (arr[mid] < target) {
                Beg = mid + 1;
            } else {
                End = mid - 1;
            }

        }
        return ans;
    }

    // WAP to find absolute difference in array using Binary search algorithm
    static int findAbsoluteDifference(int arr[], int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        int res = -1;
        if (ans == -1) {
            if (end == -1) {
                res = Math.abs(target - arr[start]);
            } else if (start == arr.length) {
                res = Math.abs(target - arr[end]);
            } else {
                int ans1 = Math.abs(target - arr[start]);
                int ans2 = Math.abs(target - arr[end]);
                res = (ans1 < ans2) ? ans1 : ans2;
            }
        }
        return res;
    }
}
