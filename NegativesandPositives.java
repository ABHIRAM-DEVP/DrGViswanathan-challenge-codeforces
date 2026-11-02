import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class NegativesandPositives{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            st = new StringTokenizer(br.readLine());     
            long totalSum = 0;
            int negativeCount = 0;
            long minAbs = Long.MAX_VALUE;
            
            for (int i = 0; i < n; i++) {
                long val = Long.parseLong(st.nextToken());
                if (val < 0) {
                    negativeCount++;
                    val = -val; 
                }
                totalSum += val;
                minAbs = Math.min(minAbs, val);
            }
            
            if (negativeCount % 2 != 0) {
                totalSum -= 2 * minAbs;
            }
            sb.append(totalSum).append("\n");
        } 
        System.out.print(sb);
    }
}
