
// WAP to find the given number is prime or not 
import java.util.Arrays;

public class PrimeNumber {
    public static void main(String[] args) {
        // prime(6);
        sieveAlgorithm(40);
    }

    static void prime(int num) {
        int count = 2;
        int sqroot = (int) Math.sqrt(num);
        while (count <= sqroot) {
            if (num % count == 0) {
                System.out.println("it is not a prime number");
                return;
            }
            count++;
        }
        System.out.println(num + " is a prime number");

    }

    // WAP to find prime number from the given range
    static void sieveAlgorithm(int num) {
        boolean arr[] = new boolean[num + 1];
        Arrays.fill(arr, true);
        int counter = 2;
        while (counter <= num) {
            if (arr[counter] == true) {
                for (int i = counter + counter; i <= num; i += 2) {
                    arr[i] = false;
                }
            }
            counter++;
        }
        for (int i = 2; i <= num; i++) {
            System.out.println(i + " : " + arr[i]);
        }
    }
}
