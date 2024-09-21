public class MinimumMissingNumber {
    public static void main(String[] args) {
        int arr[] = { 12, 2, 3, 45, 56, 78 };
        int index = getMEX(arr);
        System.out.println(index);
    }

    static int getMEX(int[] a) {
        boolean found = false;
        for (int i = 1;; i++) {
            found = false;
            for (int j = 0; j < a.length; j++) {
                int x = a[j];
                if (x == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
    }

}