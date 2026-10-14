import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            
            int left = 0;
            int right = n - 1;
            while (left < right && s.charAt(left) != s.charAt(right)) {
                left++;
                right--;
            }
            
            int ans = Math.max(0, right - left + 1);
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}
