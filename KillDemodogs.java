import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        long MOD = 1000000007;
        
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            
            // Formula: [n * (n + 1) * (4n - 1)] / 6 * 2022
            // To avoid division issues modulo 10^9 + 7, we can compute parts carefully or use modular inverse of 6.
            // Notice: 2022 / 6 = 337. So the expression simplifies to:
            // n * (n + 1) * (2n + 1) / 6 * 2022 + ... -> 337 * n * (n + 1) * (4n - 1) % MOD ? 
            // Let's derive safely: 
            // Sum = [n(n+1)(2n+1)/6 + (n-1)n(n+1)/3] * 2022
            // Factor out n(n+1)/6:
            // = [ (2n+1) + 2(n-1) ] * [n(n+1)/6] * 2022
            // = (2n + 1 + 2n - 2) * n * (n + 1) * (2022 / 6)
            // = (4n - 1) * n * (n + 1) * 337
            
            long term1 = n % MOD;
            long term2 = (n + 1) % MOD;
            long term3 = (4 * n - 1) % MOD;
            
            long ans = (term1 * term2) % MOD;
            ans = (ans * term3) % MOD;
            ans = (ans * 337) % MOD;
            
            sb.append(ans).append("\n");
        }
        
        System.out.print(sb);
    }
}
