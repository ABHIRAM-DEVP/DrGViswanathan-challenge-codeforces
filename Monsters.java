import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;

public class Monsters{
    static class Monster implements Comparable<Monster> {
        int index;
        int health;

        Monster(int index, int health) {
            this.index = index;
            this.health = health;
        }

        @Override
        public int compareTo(Monster other) {
            if (this.health != other.health) {
                return Integer.compare(other.health, this.health); 
            }
            return Integer.compare(this.index, other.index);      
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            Monster[] monsters = new Monster[n];
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int rem = a % k;
                if (rem == 0) rem = k; 
                monsters[i] = new Monster(i + 1, rem);
            }

            Arrays.sort(monsters);

            for (int i = 0; i < n; i++) {
                out.print(monsters[i].index + (i == n - 1 ? "" : " "));
            }
            out.println();
        }

        out.flush();
    }

    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[32768];
        private int head = 0;
        private int tail = 0;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private int read() throws Exception {
            if (head >= tail) {
                head = 0;
                tail = in.read(buffer, 0, buffer.length);
                if (tail <= 0) return -1;
            }
            return buffer[head++];
        }

        public int nextInt() throws Exception {
            int c = read();
            while (c <= ' ') {
                if (c == -1) return -1;
                c = read();
            }
            int res = 0;
            while (c >= '0' && c <= '9') {
                res = res * 10 + c - '0';
                c = read();
            }
            return res;
        }
    }
}
//time complexity: O(n log n)
//space complexity: O(n)