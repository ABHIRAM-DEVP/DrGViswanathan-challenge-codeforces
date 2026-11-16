import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class MakeAlmostEqualWithMod{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            long[] a = new long[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }

            long k = 2;
            while (true) {
                Set<Long> remainders = new HashSet<>();
                for (long num : a) {
                    remainders.add(num % k);
                }
                if (remainders.size() == 2) {
                    out.append(k).append('\n');
                    break;
                }
                k *= 2;
            }
        }
        System.out.print(out);
    }
}
