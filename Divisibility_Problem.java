import java.util.Scanner;

public class Divisibility_Problem {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) 
                {
                long a = sc.nextLong();
                long b = sc.nextLong();
                
                if (a % b == 0) 
                {
                    System.out.println(0);
                } 
                else 
                main{
                    System.out.println(b - (a % b));
                }
            }
        }
        sc.close();
    }
}