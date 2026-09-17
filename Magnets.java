import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        if (n == 0) {
            System.out.println(0);
            return;
        }

        // Read the first magnet
        String prev = sc.next();
        int groups = 1;

        // Process remaining magnets
        for (int i = 1; i < n; i++) {
            String current = sc.next();
            
            // If orientation changes, a new group is formed
            if (!current.equals(prev)) {
                groups++;
                prev = current;
            }
        }

        System.out.println(groups);
        sc.close();
    }
}