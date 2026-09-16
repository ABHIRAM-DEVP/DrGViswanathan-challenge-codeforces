import java.util.Arrays;
import java.util.Scanner;

public class OlyaandGamewithArrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while(t-- >0){
            int n = sc.nextInt();
            
            long minFirst = Long.MAX_VALUE;
            long minSecond = Long.MAX_VALUE;
            long sumSecond = 0;
            
            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
                long[] a = new long[m];
                
                for(int j=0; j<m;j++){
                    a[j] = sc.nextLong();
                }

                Arrays.sort(a);
                minFirst = Math.min(minFirst, a[0]);
                minSecond = Math.min(minSecond, a[1]);
                sumSecond += a[1];
            }
            long ans = minFirst + sumSecond - minSecond;
            System.out.println(ans);
        }
        
        sc.close();
    }
}
//time complexity: O(N log M)
//space complexity: O(M)