import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AssemblyviaMinimums{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = null;

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            while (st == null || !st.hasMoreTokens()) {
                String l = br.readLine();
                if (l == null) break;
                st = new StringTokenizer(l);
            }
            int n = Integer.parseInt(st.nextToken());
            int m = n * (n - 1) / 2;
            int[] b = new int[m];

            int count = 0;
            while (count < m) {
                while (!st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
                b[count++] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(b);

            StringBuilder sb = new StringBuilder();
            int idx = 0;
            int step = n - 1;

            // Pick elements according to the count pattern: n-1, n-2, ..., 1
            for (int i = 0; i < n - 1; i++) {
                sb.append(b[idx]).append(" ");
                idx += step;
                step--;
            }
            // For the last element, we can reuse the last picked element or a large value
            sb.append(b[m - 1]).append("\n");

            out.print(sb);
        }
        out.flush();
    }
}
