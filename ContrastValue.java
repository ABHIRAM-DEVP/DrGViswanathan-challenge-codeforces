import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ContrastValue{
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

            List<Integer> c = new ArrayList<>();
            int read = 0;
            while (read < n) {
                while (st == null || !st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
                int val = Integer.parseInt(st.nextToken());
                read++;
                if (c.isEmpty() || c.get(c.size() - 1) != val) {
                    c.add(val);
                }
            }

            int m = c.size();
            if (m == 1) {
                out.append(1).append('\n');
                continue;
            }

            int extrema = 0;
            for (int i = 1; i + 1 < m; i++) {
                int prev = c.get(i - 1);
                int curr = c.get(i);
                int next = c.get(i + 1);
                if ((prev < curr && curr > next) || (prev > curr && curr < next)) {
                    extrema++;
                }
            }

            out.append(extrema + 2).append('\n');
        }

        System.out.print(out);
    }
}
