import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class PlusMinusPermutation{
    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    // Sum of numbers from L to R: R*(R+1)/2 - (L-1)*L/2
    private static long sumRange(long l, long r) {
        if (l > r) return 0;
        return r * (r + 1) / 2 - (l - 1) * l / 2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());

            long cx = n / x;
            long cy = n / y;
            
            long l = lcm(x, y);
            long common = n / l;

            long exclusiveX = cx - common;
            long exclusiveY = cy - common;

            // Largest exclusiveX numbers are from (n - exclusiveX + 1) to n
            long maxSum = sumRange(n - exclusiveX + 1, n);
            // Smallest exclusiveY numbers are from 1 to exclusiveY
            long minSum = sumRange(1, exclusiveY);

            sb.append(maxSum - minSum).append("\n");
        }

        System.out.print(sb);
    }
}
