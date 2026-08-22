import java.util.*;
public class Team
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][3];
        int c=0, done=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            c=0;
            for(int j=0;j<3;j++)
            {
                if(arr[i][j] == 1)
                {
                    c++;
                }
            }
            if(c>=2)
            {
                done++;
            }
        }
        System.out.println(done);
    }
}
