public class MaximumValue {
    public static void main(String[] args) {
        int arr[] = { 10, 13, 15, 16, 48, 15 };
        int temp[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                temp[i] = arr[i] * 2;
            } else {
                temp[i] = arr[i];
            }
        }
        int max = 0;
        for (int i = 0; i < temp.length; i++) {
            max = temp[0];
            if (temp[i] > max) {
                int tempo = temp[i];
                temp[i] = max;
                max = tempo;
            }
        }
        System.out.println(max);
    }
}
