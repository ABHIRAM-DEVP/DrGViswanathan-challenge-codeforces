import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemovingSmallestMultiples{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;

        int t = Integer.parseInt(line.trim());
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();

            boolean[] removed = new boolean[n + 1];
            long totalCost = 0;

            for (int k = 1; k <= n; k++) {
                for (int m = k; m <= n; m += k) {
                    if (s.charAt(m - 1) == '1') {
                        // Cannot skip over an element that must remain in T
                        break;
                    }
                    if (!removed[m]) {
                        removed[m] = true;
                        totalCost += k;
                    }
                }
            }

            out.append(totalCost).append('\n');
        }

        System.out.print(out);
    }
}
