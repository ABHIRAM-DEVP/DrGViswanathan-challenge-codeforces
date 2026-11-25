import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Scuza{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

            long[] prefSum = new long[n];
            long[] prefMax = new long[n];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                long a = Long.parseLong(st.nextToken());
                prefSum[i] = a + (i > 0 ? prefSum[i - 1] : 0);
                prefMax[i] = Math.max(a, (i > 0 ? prefMax[i - 1] : 0));
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < q; i++) {
                long k = Long.parseLong(st.nextToken());
                int idx = upperBound(prefMax, k) - 1;
                
                if (idx < 0) {
                    out.append(0).append(" ");
                } else {
                    out.append(prefSum[idx]).append(" ");
                }
            }
            out.append("\n");
        }
        System.out.print(out);
    }

    private static int upperBound(long[] arr, long target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
