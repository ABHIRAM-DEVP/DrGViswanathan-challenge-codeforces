import java.util.Scanner;

public class VasilijeinCacak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        StringBuilder sb = new StringBuilder();

        
        
        while (t-- > 0) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            long x = scanner.nextLong();
            long minSum = k * (k + 1) / 2;
            long maxSum = k * (2 * n - k + 1) / 2; 
            if(x >= minSum && x <= maxSum){
                sb.append("YES\n");
            } 
            else{
                sb.append("NO\n");
            }
        }
        System.out.print(sb);
        scanner.close();
    }
}
