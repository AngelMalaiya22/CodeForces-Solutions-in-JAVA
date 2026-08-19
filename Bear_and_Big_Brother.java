import java.util.Scanner;
public class Bear_and_Big_Brother
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int Limak= sc.nextInt();
        int Bob= sc.nextInt();
        int year=0;
        
        while(Limak <= Bob)
        {
            Limak *=3;
            Bob *=2;
            year++;
        }
        
        System.out.print(year);
    }
}