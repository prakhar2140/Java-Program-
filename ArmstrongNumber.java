// WAP to find out the given number is armstrong or not 
public class ArmstrongNumber {
    public static void main(String[] args) {
        armStrong(153);
    }

    static void armStrong(int num) {
        int temp = num;
        int digit = 0;
        int resNum = 0;
        while (num > 0) {
            digit = num % 10;
            resNum = resNum + digit * digit * digit;
            num /= 10;
        }
        if (temp == resNum) {
            System.out.println("It is a Armstrong Number");
        } else {
            System.out.println("It is not a Armstrong Number");
        }
    }
}
