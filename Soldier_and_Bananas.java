import java.util.Scanner;

public class Soldier_and_Bananas 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        long k = sc.nextLong();
        long n = sc.nextLong();
        long w = sc.nextLong();
        long totalCost = k * w * (w + 1) / 2;
        
        long borrow = totalCost - n;

        if (borrow > 0) 
        {
            System.out.println(borrow);
        } 
        else 
        {
            System.out.println(0);
        }

        sc.close();
    }
}