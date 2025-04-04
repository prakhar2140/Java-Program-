// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static int addDigits(int num) {
        if (num <= 1)
            return num;
        return 1 + (num - 1) % 9;
    }

    public static void main(String args[]) {
        int num = addDigits(38);
        System.out.println(num);
    }
}
