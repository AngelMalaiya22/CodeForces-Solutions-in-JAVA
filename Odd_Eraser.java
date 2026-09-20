import java.util.*;

public class Odd_Eraser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int first = sc.nextInt();

            int last = first;

            for (int i = 1; i < n; i++) {
                last = sc.nextInt();
            }

            System.out.println(gcd(first, last));
        }

        sc.close();
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}