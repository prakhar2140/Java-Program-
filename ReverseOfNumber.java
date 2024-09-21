
// WAP to find out the reverse of the given number and also check whether palindrome or not
import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        reverseOfNumber(a);
    }

    static void reverseOfNumber(int n) {
        int rev = 0;
        int temp = n;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        System.out.println("Reverse of the given no is " + rev);
        if (rev == temp) {
            System.out.println("Given Number is a palindrome number");
        } else {
            System.out.println("Given Number is not palindrome");
        }
    }
}
