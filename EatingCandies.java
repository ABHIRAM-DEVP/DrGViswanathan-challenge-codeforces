import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class EatingCandies{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            long[] w = new long[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                w[i] = Long.parseLong(st.nextToken());
            }

            int left = 0, right = n - 1;
            long leftSum = 0, rightSum = 0;
            int maxCandies = 0;

            while (left <= right) {
                if (leftSum <= rightSum) {
                    leftSum += w[left++];
                } else {
                    rightSum += w[right--];
                }

                if (leftSum == rightSum) {
                    maxCandies = left + (n - 1 - right);
                }
            }

            sb.append(maxCandies).append("\n");
        }

        System.out.print(sb);
    }
}
