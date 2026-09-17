import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Is_your_horseshoe_on_the_other_hoof
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> uniqueColors = new HashSet<>();

        for (int i = 0; i < 4; i++) {
            uniqueColors.add(sc.nextInt());
        }

        System.out.println(4 - uniqueColors.size());
    }
}