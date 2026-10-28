import java.util.Arrays;
import java.util.Scanner;

public class BalancedRound{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        StringBuilder out = new StringBuilder();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            
            Arrays.sort(arr);
            int maxLen = 1;
            int currentLen = 1;
            
            for (int i = 0; i < n - 1; i++) {
                if(arr[i + 1] - arr[i] <= k){
                    currentLen++;
                } 
                else{
                    maxLen = Math.max(maxLen, currentLen);
                    currentLen = 1;
                }
            }
            maxLen = Math.max(maxLen, currentLen);
            out.append(n - maxLen).append("\n");
        }
        System.out.print(out);
        scanner.close();
    }
}