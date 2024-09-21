
import java.util.Scanner;

public class BinaryConversion {

    public static void main(String[] args) {
        System.out.println("Enter the number that you want to convert in binary form");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        decimalToBinary(a);
        System.out.println("Enter the decimal number that you want to convert in decimal form");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        binaryToDecimal(b);
    }

    // WAP to convert the decimal number into binary number
    static void decimalToBinary(int decimalNum) {
        int resNum = 0;
        int power = 0;
        while (decimalNum > 0) {
            int rem = decimalNum % 2;
            decimalNum /= 2;
            resNum += rem * Math.pow(10, power);
            power++;
        }
        System.out.println("Result is " + resNum);
    }

    // WAP to convert the binary number into decimal number
    static void binaryToDecimal(int binaryNum) {
        int resNum = 0;
        int power = 0;
        while (binaryNum > 0) {
            int unitDigit = binaryNum % 10;
            binaryNum /= 10;
            resNum += unitDigit * Math.pow(2, power);
            power++;
        }
        System.out.println("Result is " + resNum);
    }
}