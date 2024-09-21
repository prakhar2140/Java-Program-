// WAP to find out how many bits are their in the given number 
public class CountingNumber {
    public static void main(String[] args) {
        counting(0);
    }

    static void counting(int num) {
        int count = 0;
        if (num == 0) {
            System.out.println("Number of dgit is " + 0);
        } else {
            while (num > 0) {
                num /= 10;
                count++;
            }
            System.out.println("Number of digit in the given no " + count);
        }
    }
}
