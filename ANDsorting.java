import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    private static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] words = new String[n];
            boolean found = false;

            HashSet<String> seenFull = new HashSet<>();
            HashSet<String> seenPrefix = new HashSet<>();

            for (int i = 0; i < n; i++) {
                words[i] = br.readLine().trim();
                if (found) continue;

                String s = words[i];
                String rev = reverse(s);

                if (s.equals(rev)) {
                    found = true;
                }
                else if (seenFull.contains(rev)) {
                    found = true;
                }
                else if (s.length() == 3 && seenFull.contains(rev.substring(0, 2))) {
                    found = true;
                }
                else if (s.length() == 2 && seenPrefix.contains(rev)) {
                    found = true;
                }

                seenFull.add(s);
                if (s.length() == 3) {
                    seenPrefix.add(s.substring(0, 2));
                }
            }

            if (found) {
                sb.append("YES\n");
            } 
            else {
                sb.append("NO\n");
            }
        }

        System.out.print(sb);
    }
}
