import java.util.Scanner;

public class Raspberries{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int minOps = k;
            int evenCount = 0;
            
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                
                if (x % 2 == 0) {
                    evenCount++;
                }
                
                int rem = x % k;
                int ops = (rem == 0) ? 0 : (k - rem);
                minOps = Math.min(minOps, ops);
            }
            
            if (k == 4) {
                int opsForTwoEvens = Math.max(0, 2 - evenCount);
                minOps = Math.min(minOps, opsForTwoEvens);
            }
            
            System.out.println(minOps);
        }
        
        sc.close();
    }
}

//time complexity: O(n)
//space complexity: O(1)