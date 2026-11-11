import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long k = Long.parseLong(st.nextToken());

            long[] a = new long[n];
            HashSet<Long> set = new HashSet<>();
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
                set.add(a[i]);
            }

            boolean possible = false;
            for (int i = 0; i < n; i++) {
                // Check if (a[i] + k) exists in the set
                if (set.contains(a[i] + k)) {
                    possible = true;
                    break;
                }
            }

            if (possible) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.print(sb);
    }
}
