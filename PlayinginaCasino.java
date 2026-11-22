import java.io.*;
import java.util.*;

public class PlayinginaCasino{
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            int m = fs.nextInt();

            // Store column-wise so each column can be sorted independently
            long[][] col = new long[m][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    col[j][i] = fs.nextLong();
                }
            }

            long totalWinnings = 0L;
            for (int j = 0; j < m; j++) {
                Arrays.sort(col[j]);
                for (int p = 0; p < n; p++) {
                    long coeff = 2L * p - (n - 1);
                    totalWinnings += coeff * col[j][p];
                }
            }

            sb.append(totalWinnings).append('\n');
        }

        System.out.print(sb.toString());
    }

    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        FastScanner(InputStream in) {
            this.in = in;
        }

        private int readByte() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            return (int) nextLong();
        }

        long nextLong() throws IOException {
            int c;
            do {
                c = readByte();
                if (c == -1) return Long.MIN_VALUE;
            } while (c <= ' ');

            long sign = 1L;
            if (c == '-') {
                sign = -1L;
                c = readByte();
            }

            long val = 0L;
            while (c > ' ') {
                val = val * 10L + (c - '0');
                c = readByte();
            }
            return val * sign;
        }
    }
}
