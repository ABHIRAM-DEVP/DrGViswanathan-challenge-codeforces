import java.util.Scanner;

public class PermutationSwap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;

            for (int i = 1; i <= n; i++) {
                int val = sc.nextInt();
                int diff = Math.abs(val - i);
                ans = gcd(ans, diff);
            }

            System.out.println(ans);
        }
        
        sc.close();
    }

    

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}