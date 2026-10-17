import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MakeitBeautiful{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] parts = br.readLine().trim().split("\\s+");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(parts[i]);
            }
            
            Arrays.sort(a);
            
            if (a[0] == a[n - 1]) {
                sb.append("NO\n");
            } else {
                sb.append("YES\n");
                sb.append(a[n - 1]).append(" ").append(a[0]);
                for (int i = 1; i < n - 1; i++) {
                    sb.append(" ").append(a[i]);
                }
                sb.append("\n");
            }
        }

        
        System.out.print(sb);
    }
}