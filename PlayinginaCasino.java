import java.io.*;
import java.util.*;

public class PlayinginaCasino{
    static int luckiness(int x) {
        int mn = 9, mx = 0;
        while (x > 0) {
            int d = x % 10;
            if (d < mn) mn = d;
            if (d > mx) mx = d;
            x /= 10;
        }
        return mx - mn;
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();
        int t = fs.nextInt();
        while (t-- > 0) {
            int l = fs.nextInt();
            int r = fs.nextInt();

            int bestNum = l;
            int bestLuck = -1;
            int limit = Math.min(r, l + 105);

            for (int x = l; x <= limit; x++) {
                int luck = luckiness(x);
                if (luck > bestLuck) {
                    bestLuck = luck;
                    bestNum = x;
                    if (bestLuck == 9) break;
                }
            }
            out.append(bestNum).append('\n');
        }
        System.out.print(out);
    }

    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        FastScanner(InputStream is) { in = is; }

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            while ((c = read()) <= ' ') {
                if (c == -1) return -1;
            }
            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }
            int val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }
    }
}
