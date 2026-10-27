import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SortTheSubarray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        
        StringBuilder out = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            
            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            
            int[] b = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                b[i] = Integer.parseInt(st.nextToken());
            }
            
            int l = 0, r = n - 1;
            while (l < n && a[l] == b[l]) {
                l++;
            }
            while (r >= 0 && a[r] == b[r]) {
                r--;
            }
            
            while (l > 0 && a[l - 1] <= a[l]) {
                l--;
            }
            
            while (r < n - 1 && a[r] <= a[r + 1]) {
                r++;
            }
            
            out.append((l + 1)).append(" ").append((r + 1)).append("\n");
        }
        
        System.out.print(out);
    }
}
