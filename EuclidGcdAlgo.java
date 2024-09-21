// WAP to find out GCD of the given two numbers using Euclid Division algorithm
public class EuclidGcdAlgo {
    public static void main(String[] args) {
        euclideanGcd(12, 36);
    }

    static void euclideanGcd(int num1, int num2) {
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
        }
        int res = num1;
        if (num1 == 0) {
            res = num2;
        }
        System.out.println("Gcd is " + res);
    }
}