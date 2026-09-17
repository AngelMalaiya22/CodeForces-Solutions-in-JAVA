import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Min_Max_Game {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            st = new StringTokenizer(br.readLine());

            int countOnes = 0;
            int countZeros = 0;

            for (int i = 0; i < n; i++) {
                int val = Integer.parseInt(st.nextToken());
                if (val == 1) {
                    countOnes++;
                } else {
                    countZeros++;
                }
            }

            if (countOnes >= countZeros) {
                sb.append("Bessie\n");
            } else {
                sb.append("Elsie\n");
            }
        }

        System.out.print(sb);
    }
}