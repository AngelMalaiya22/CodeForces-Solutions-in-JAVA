import java.util.Scanner;
public class Word_Capitalization
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        if (str == null || str.isEmpty()) 
        {
            System.out.println(str);
        }
        System.out.println(Character.toUpperCase(str.charAt(0)) + str.substring(1));
    }
}