import java.util.Scanner;

public class George_and_Accommodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt(); // current occupants
            int q = sc.nextInt(); // total capacity
            
            // Check if there are at least 2 available spots
            if (q - p >= 2) {
                count++;
            }
        }
        
        System.out.println(count);
        sc.close();
    }
}