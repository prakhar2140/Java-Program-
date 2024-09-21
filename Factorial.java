// WAP to find out the factorial of the given number 
public class Factorial {
    public static void main(String[] args) {
        factorial(7);
        findTrailingZerosInFactorial(30);
    }

    static void factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        System.out.println("Factorial of the no is " + result);
    }

    // WAP to find the trailing 0's in the factorial
    static void findTrailingZerosInFactorial(int num) {
        double res = 0;
        for (int i = 5; i <= num; i = i * i) {
            res = res + num / i;
        }
        System.out.println(res);
    }
}
