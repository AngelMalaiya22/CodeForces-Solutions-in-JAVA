import java.util.Scanner;

public class BoyorGirl
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String username = sc.next().toLowerCase();
        char[] arr = username.toCharArray();
        int freq = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] != '0')
            {
                freq++;
                for (int j = i + 1; j < arr.length; j++)
                {
                    if (arr[i] == arr[j])
                    {
                        arr[j] = '0';
                    }
                }
            }
        }

        if (freq % 2 == 0)
        {
            System.out.println("CHAT WITH HER!");
        }
        else
        {
            System.out.println("IGNORE HIM!");
        }
    }
}