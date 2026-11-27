import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FriendsandtheRestaurant{
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

            int[] x = new int[n];
            int[] diff = new int[n];

            for (int i = 0; i < n; i++) {
                while (st == null || !st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
                x[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < n; i++) {
                while (st == null || !st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
                int y = Integer.parseInt(st.nextToken());
                diff[i] = y - x[i];
            }

            Arrays.sort(diff);

            int left = 0;
            int right = n - 1;
            int groups = 0;

            while (left < right) {
                if (diff[left] + diff[right] >= 0) {
                    groups++;
                    left++;
                    right--;
                } else {
                    left++;
                }
            }

            out.append(groups).append('\n');
        }

        System.out.print(out);
    }
}
