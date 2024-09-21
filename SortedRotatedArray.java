// WAP to implement Binary search algorithm on sorted rotated array
// to find the minimum and maximum element
public class SortedRotatedArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 65 };
        int index = minElementSortedRoattedArray(arr);
        System.out.println("Index of minimum element in the rotated array" + index);
        int value = maxElement(arr);// searchIntoRotatedArray(arr, 5);
        System.out.println(value);
    }

    static int minElementSortedRoattedArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return mid;
            } // If right half is sorted move left
            else if (arr[end] > arr[mid]) {
                end = mid - 1;
            } // If left half is sorted move right
            else {
                start = mid + 1;
            }

        }
        return start;
    }

    static int rotationCountAnticlockwise(int arr[]) {
        int index = minElementSortedRoattedArray(arr);
        int rotationCount = (arr.length - index) % arr.length;
        return rotationCount;

    }

    static int maxElement(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid < arr.length - 1 && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // if right half is sorted, move left
            else if (arr[start] > arr[mid]) {
                end = mid - 1;
            }
            // if left half is sorted, move right
            else {
                start = mid + 1;
            }
        }
        return end;
    }

    static int searchIntoRotatedArray(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            // Left side is sorted
            if (arr[start] <= arr[mid]) {
                // Can answer be found in the left side
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } // right side is sorted
            else {
                // can ans be found in the right side
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return ans;
    }

}