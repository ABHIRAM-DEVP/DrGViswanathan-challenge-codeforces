import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        
        StringBuilder out = new StringBuilder();
        
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            
            int[] a = new int[n + 1];
            boolean possible = true;
            
            for (int i = 1; i <= n; i++) {
                // Find the smallest multiple of i that is greater than or equal to l
                int multiple = (l + i - 1) / i * i;
                
                if (multiple <= r) {
                    a[i] = multiple;
                } else {
                    possible = false;
                    break;
                }
            }
            
            if (!possible) {
                out.append("NO\n");
            } else {
                out.append("YES\n");
                for (int i = 1; i <= n; i++) {
                    out.append(a[i]).append(i == n ? "" : " ");
                }
                out.append("\n");
            }
        }
        System.out.print(out);
    }
}
