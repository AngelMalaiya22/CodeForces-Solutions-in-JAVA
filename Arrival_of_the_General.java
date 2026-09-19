import java.util.Scanner;

public class Arrival_of_the_General {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxVal = -1;
        int minVal = 101;
        int maxIdx = 0;
        int minIdx = 0;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();

            // Find the first occurrence of the maximum element
            if (val > maxVal) {
                maxVal = val;
                maxIdx = i;
            }

            // Find the last occurrence of the minimum element
            if (val <= minVal) {
                minVal = val;
                minIdx = i;
            }
        }

        int moves = maxIdx + (n - 1 - minIdx);

        // If the max element is after the min element, their paths overlap during swaps
        if (maxIdx > minIdx) {
            moves--;
        }

        System.out.println(moves);
    }
}