import java.util.Arrays;
import java.util.Scanner;

public class SumofMedians{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int total = n * k;
            
            long[] a = new long[total];
            for (int i = 0; i < total; i++) {
                a[i] = sc.nextLong();
            }
            
            int step = n / 2;
            
            long sum = 0;
            int idx = total - 1 - step;
            
            for (int i = 0; i < k; i++) {
                sum += a[idx];
                idx -= (step + 1);
            }
            
            System.out.println(sum);
        }
        
        sc.close();
    }
}

//time complexity: O(n*k)
//space complexity: O(n*k)