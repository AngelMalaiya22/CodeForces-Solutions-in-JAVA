import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        int l = 0;
        int u = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                l++;
            } else if (Character.isUpperCase(str.charAt(i))) {
                u++;
            }
        }

        if (l >= u) {
            System.out.println(str.toLowerCase());
        } else {
            System.out.println(str.toUpperCase());
        }

        sc.close();
    }
}