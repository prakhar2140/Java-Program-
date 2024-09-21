// WAP to find square root of the number by using Newton Rapson Algorithm
public class NewtonRapson {
    public static void main(String[] args) {
        // int a = (int)
        NewtonRapsons(36);
        // System.out.println(a);
    }

    static void NewtonRapsons(int num) {
        double tol = 0.0001;
        double root;
        double x = num;
        while (true) {
            root = 0.5 * (x + (num / x));
            double ans = x - root;
            if (ans < tol) {
                break;
            }
            x = root;
        }
        // return root;
        System.out.println(root);
    }
}
