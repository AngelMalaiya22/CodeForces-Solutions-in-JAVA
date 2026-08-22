import java.util.Arrays;
import java.util.Scanner;

public class Helpful_Maths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        char[] digits = s.replaceAll("\\+", "").toCharArray();
        Arrays.sort(digits);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            result.append(digits[i]);
            if (i < digits.length - 1) {
                result.append("+");
            }
        }

        System.out.println(result.toString());
    }
}