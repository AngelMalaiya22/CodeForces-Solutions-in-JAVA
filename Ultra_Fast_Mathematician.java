import java.util.Scanner;

public class Ultra_Fast_Mathematician {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNext()) {
            String s1 = scanner.next();
            String s2 = scanner.next();
            
            StringBuilder sb = new StringBuilder();
            
            // Perform XOR logic character by character
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    sb.append('1');
                } else {
                    sb.append('0');
                }
            }
            
            System.out.println(sb.toString());
        }
        
        scanner.close();
    }
}