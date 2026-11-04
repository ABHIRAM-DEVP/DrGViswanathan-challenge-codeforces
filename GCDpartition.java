import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    private static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            long[] a = new long[n];
            long totalSum = 0;
            
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
                totalSum += a[i];
            }
            
            long maxGcd = 0;
            long prefixSum = 0;
            
            for (int i = 0; i < n - 1; i++) {
                prefixSum += a[i];
                long suffixSum = totalSum - prefixSum;
                maxGcd = Math.max(maxGcd, gcd(prefixSum, suffixSum));
            }
            
            sb.append(maxGcd).append("\n");
        }
        
        System.out.print(sb);
    }
}
