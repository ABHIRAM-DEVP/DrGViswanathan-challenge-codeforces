import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class YetAnotherCardDeck{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        
        int[] a = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        // pos[color] stores the current 1-based index of each color (1 to 50)
        // Since we only care about the *first* occurrence of each color:
        int[] pos = new int[51];
        for (int i = 1; i <= 50; i++) {
            pos[i] = -1;
        }
        
        // Record the first position of each color from top to bottom
        for (int i = n; i >= 1; i--) {
            pos[a[i]] = i;
        }
        
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < q; i++) {
            int color = Integer.parseInt(st.nextToken());
            int p = pos[color];
            sb.append(p).append(" ");
            
            // Update positions: any color whose previous position was above `p` now shifts down by 1
            for (int c = 1; c <= 50; c++) {
                if (pos[c] != -1 && pos[c] < p) {
                    pos[c]++;
                }
            }
            // Moved color now sits at the top (index 1)
            pos[color] = 1;
        }
        
        System.out.println(sb.toString().trim());
    }
}
