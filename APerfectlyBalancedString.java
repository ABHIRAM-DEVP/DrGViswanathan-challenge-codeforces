import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class APerfectlyBalancedString{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String s = br.readLine().trim();
            HashSet<Character> uniqueChars = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                uniqueChars.add(s.charAt(i));
            }

            int u = uniqueChars.size();
            boolean balanced = true;

            for (int i = u; i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(i - u)) {
                    balanced = false;
                    break;
                }
            }

            if (balanced) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.print(sb);
    }
}
