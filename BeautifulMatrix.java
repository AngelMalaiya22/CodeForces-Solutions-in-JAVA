import java.util.Scanner;

public class BeautifulMatrix 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int rowOfOne = 0;
        int colOfOne = 0;
        
        for (int r = 1; r <= 5; r++) 
            {
            for (int c = 1; c <= 5; c++) 
                {
                int value = scanner.nextInt();
                if (value == 1) 
                    {
                    rowOfOne = r;
                    colOfOne = c;
                }
            }
        }
        
        int minMoves = Math.abs(rowOfOne - 3) + Math.abs(colOfOne - 3);
        
        System.out.println(minMoves);
        
        scanner.close();
    }
}