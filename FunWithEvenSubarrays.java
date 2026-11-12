import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FunWithEvenSubarrays{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());
        
        StringBuilder out = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine().trim());
            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(reader.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            
            int ops = 0;
            int cnt = 1; // Length of the suffix that is already equal to a[n-1]
            
            // Traverse backwards from the element right before the matching suffix
            int i = n - 2;
            while (i >= 0) {
                if (a[i] == a[n - 1]) {
                    cnt++;
                    i--;
                } else {
                    // We need an operation covering elements from index (i - cnt + 1) to i
                    ops++;
                    cnt *= 2; // The matched suffix length doubles
                    i = n - 1 - cnt; // Move pointer to check before the newly matched block
                }
            }
            
            out.append(ops).append("\n");
        }
        
        System.out.print(out);
    }
}
