import java.util.Scanner;

public class Queue_at_the_School {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int t = sc.nextInt();
        char[] s = sc.next().toCharArray();
        
        // Simulate the queue transformation for t seconds
        for (int time = 0; time < t; time++) {
            int i = 0;
            while (i < n - 1) {
                if (s[i] == 'B' && s[i + 1] == 'G') {
                    // Swap 'B' and 'G'
                    s[i] = 'G';
                    s[i + 1] = 'B';
                    i += 2; // Skip next index to prevent double-swapping in 1 second
                } else {
                    i++;
                }
            }
        }
        
        System.out.println(new String(s));
        sc.close();
    }
}