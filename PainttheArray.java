import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class PainttheArray{
    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            long[] a = new long[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }

            long gcd1 = 0, gcd2 = 0;
            // Compute GCD of even-indexed and odd-indexed elements
            for (int i = 0; i < n; i += 2) {
                gcd1 = gcd(gcd1, a[i]);
            }
            for (int i = 1; i < n; i += 2) {
                gcd2 = gcd(gcd2, a[i]);
            }

            boolean ok1 = true;
            // Check if gcd1 divides any odd-indexed element
            for (int i = 1; i < n; i += 2) {
                if (a[i] % gcd1 == 0) {
                    ok1 = false;
                    break;
                }
            }

            boolean ok2 = true;
            // Check if gcd2 divides any even-indexed element
            for (int i = 0; i < n; i += 2) {
                if (a[i] % gcd2 == 0) {
                    ok2 = false;
                    break;
                }
            }

            long ans = 0;
            if (ok1) ans = Math.max(ans, gcd1);
            if (ok2) ans = Math.max(ans, gcd2);

            sb.append(ans).append("\n");
        }

        System.out.print(sb);
    }
}
