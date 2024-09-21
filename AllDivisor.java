//WAP to print all the divisor of the given number
public class AllDivisor {
    public static void main(String[] args) {
        printAllDivisor(36);
    }

    static void printAllDivisor(int num) {
        int count = 1;
        int sqroot = (int) Math.sqrt(num);
        while (count <= sqroot) {
            if (num % count == 0) {
                System.out.println(count + " is a divisor of num " + num);
                int otherNumber = num / count;
                if (otherNumber != count)
                    System.out.println(otherNumber + " is divisor of " + num);
            }
            count++;
        }
    }

}
