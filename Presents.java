import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Presents {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        if (line == null) return;
        int n = Integer.parseInt(line.trim());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] result = new int[n + 1];
        
        for (int giver = 1; giver <= n; giver++) {
            int receiver = Integer.parseInt(st.nextToken());
            result[receiver] = giver;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int receiver = 1; receiver <= n; receiver++) {
            sb.append(result[receiver]).append(receiver == n ? "" : " ");
        }
        
        System.out.println(sb);
    }
}