import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class subarraySort{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;

        int t = Integer.parseInt(line.trim());
        StringBuilder out = new StringBuilder();
        StringTokenizer st = null;

        while (t-- > 0) {
            while (st == null || !st.hasMoreTokens()) {
                String l = br.readLine();
                if (l == null) break;
                st = new StringTokenizer(l);
            }
            int n = Integer.parseInt(st.nextToken());

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                while (st == null || !st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
                a[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < n; i++) {
                while (st == null || !st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
                b[i] = Integer.parseInt(st.nextToken());
            }

            int l = 0;
            int r = n - 1;

            while (l < n && a[l] == b[l]) {
                l++;
            }
            while (r >= 0 && a[r] == b[r]) {
                r--;
            }

            if (l > r) {
                // a and b are identical; find longest non-decreasing segment in b
                int bestL = 0, bestR = 0;
                int curL = 0;
                for (int i = 1; i < n; i++) {
                    if (b[i] < b[i - 1]) {
                        curL = i;
                    }
                    if (i - curL > bestR - bestL) {
                        bestL = curL;
                        bestR = i;
                    }
                }
                out.append(bestL + 1).append(' ').append(bestR + 1).append('\n');
                continue;
            }

            while (l > 0 && b[l - 1] <= b[l]) {
                l--;
            }
            while (r + 1 < n && b[r] <= b[r + 1]) {
                r++;
            }

            out.append(l + 1).append(' ').append(r + 1).append('\n');
        }

        System.out.print(out);
    }
}
