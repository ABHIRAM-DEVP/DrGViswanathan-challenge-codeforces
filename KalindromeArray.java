import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KalindromeArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        
        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            out.append(isKalindrome(a, n) ? "YES\n" : "NO\n");
        }
        System.out.print(out);
    }

    private static boolean isKalindrome(int[] a, int n) {
        int l = 0, r = n - 1;
        while (l < r) {
            if (a[l] != a[r]) {
                return checkWithout(a, n, a[l]) || checkWithout(a, n, a[r]);
            }
            l++;
            r--;
        }
        return true;
    }

    private static boolean checkWithout(int[] a, int n, int skipVal) {
        int l = 0, r = n - 1;
        while (l < r) {
            if (a[l] == skipVal) {
                l++;
            } else if (a[r] == skipVal) {
                r--;
            } else if (a[l] != a[r]) {
                return false;
            } else {
                l++;
                r--;
            }
        }
        return true;
    }
}
