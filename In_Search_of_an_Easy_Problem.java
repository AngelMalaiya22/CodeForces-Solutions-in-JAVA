import java.util.Scanner;
public class In_Search_of_an_Easy_Problem
{
    public static void main(String args[])
    {
        int c=0;
        Scanner sc= new Scanner(System.in);
        int range=sc.nextInt();
        int arr[]= new int[range];
        for(int i=0;i<range;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i] == 1)
            {
                c++;
            }
        }

        if(c==0)
        {
            System.out.println("EASY");
        }
        else
        {
            System.out.println("HARD");
        }
    }
}