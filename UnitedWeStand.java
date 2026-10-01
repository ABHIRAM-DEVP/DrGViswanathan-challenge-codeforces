import java.util.Arrays;
import java.util.Scanner;
public class UnitedWeStand{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            Arrays.sort(a);

            if (a[0] == a[n - 1]) {
                sb.append("-1\n");
                continue;
            }
            int idx = n - 1;
            while (idx >= 0 && a[idx] == a[n - 1]) {
                idx--;
            }
            int bSize = idx + 1;
            int cSize = n - bSize;
            
            sb.append(bSize).append(" ").append(cSize).append("\n");
            
            for (int i = 0; i < bSize; i++) {
                sb.append(a[i]).append(i == bSize - 1 ? "" : " ");
            }
            sb.append("\n");
            

            
            for (int i = bSize; i < n; i++) {
                sb.append(a[i]).append(i == n - 1 ? "" : " ");
            }
            sb.append("\n");
        }
        
        System.out.print(sb);
        sc.close();
        
    }
}