import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SkiResort{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String line = br.readLine();
        if (line == null || line.trim().isEmpty()) return;

        int t = Integer.parseInt(line.trim());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            long q = Long.parseLong(st.nextToken());

            st = new StringTokenizer(br.readLine());
            long count = 0;
            long totalWays = 0;

            for (int i = 0; i < n; i++) {
                long temp = Long.parseLong(st.nextToken());

                if (temp <= q) {
                    count++;
                } else {
                    if (count >= k) {
                        long len = count - k + 1;
                        totalWays += (len * (len + 1)) / 2;
                    }
                    count = 0;
                }
            }

            if (count >= k) {
                long len = count - k + 1;
                totalWays += (len * (len + 1)) / 2;
            }

            sb.append(totalWays).append("\n");
        }

        System.out.print(sb);
    }
}

//time complexity: O(n)
//space complexity: O(1)