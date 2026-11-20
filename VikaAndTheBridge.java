import java.io.*;
import java.util.*;

public class VikaAndTheBridge{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[] last = new int[k + 1], max1 = new int[k + 1], max2 = new int[k + 1];
            st = new StringTokenizer(br.readLine());

            for (int i = 1; i <= n; i++) {
                int c = Integer.parseInt(st.nextToken());
                int g = i - last[c] - 1;
                if (g >= max1[c]) { max2[c] = max1[c]; max1[c] = g; }
                else if (g > max2[c]) { max2[c] = g; }
                last[c] = i;
            }

            int ans = Integer.MAX_VALUE;
            for (int c = 1; c <= k; c++) {
                int g = n - last[c];
                if (g >= max1[c]) { max2[c] = max1[c]; max1[c] = g; }
                else if (g > max2[c]) { max2[c] = g; }
                ans = Math.min(ans, Math.max(max2[c], max1[c] / 2));
            }
            out.append(ans).append('\n');
        }
        System.out.print(out);
    }
}
