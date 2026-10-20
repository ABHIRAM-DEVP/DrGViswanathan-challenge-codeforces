import java.util.Scanner;

public class TwoPermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if ((a == n && b == n) || (a + b + 2 <= n)) {
                sb.append("Yes\n");
            } else {
                sb.append("No\n");
            }
        }
        
        System.out.print(sb);
        scanner.close();
    }
}