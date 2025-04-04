// WAP to find second lowest element in the array 
// WAP to find second largest element in the array 
public class Problem2 {
    public static void main(String[] args) {
        int arr[] = { 4, 4, 4, 2, 3, 5, 5, 5, 1 };
        secondSmallest(arr);
    }

    static void secondSmallest(int arr[]) {
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        int secondLarge = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                secondLarge = max;
                max = arr[i];
            } else if (arr[i] < secondLarge && arr[i] != max) {
                secondLarge = arr[i];
            }
        }
        System.out.print("Seccond Largest element " + secondLarge);
    }
}
