import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        Set<Character> uniqueLetters = new HashSet<>();

        for (char c : s.toCharArray()) {
            uniqueLetters.add(Character.toLowerCase(c));
        }

        if (uniqueLetters.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}