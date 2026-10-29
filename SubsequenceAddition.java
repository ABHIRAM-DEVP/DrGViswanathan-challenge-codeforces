import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = null;

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            long[] c = new long[n];
            
            int readCount = 0;
            while (readCount < n) {
                if (st == null || !st.hasMoreTokens()) {
                    String l = br.readLine();
                    if (l == null) break;
                    st = new StringTokenizer(l);
                }
                c[readCount++] = Long.parseLong(st.nextToken());
            }

            Arrays.sort(c);

            // The initial element must be 1 because we start with [1]
            if (c[0] != 1) {
                out.println("NO");
                continue;
            }

            long sum = 1;
            boolean possible = true;

            for (int i = 1; i < n; i++) {
                if (c[i] > sum) {
                    possible = false;
                    break;
                }
                sum += c[i];
            }

            if (possible) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
        out.flush();
    }
}
