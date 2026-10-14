import java.util.Scanner;

public class PrependandAppend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        

        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] pos = new int[n + 2]; 
            
            for (int i = 1; i <= n; i++) {
                int x = scanner.nextInt();
                if (x <= n) {
                    pos[x] = i;
                }
            }
            
            int l = (n + 1) / 2;
            int r = (n + 2) / 2;

            if (n % 2 == 0 && pos[l] > pos[r]) {
                sb.append(n / 2).append("\n");
                continue;
            }
            
            while (l - 1 >= 1 && r + 1 <= n && pos[l - 1] < pos[l] && pos[r] < pos[r + 1]) {
                l--;
                r++;
            }
            
            int remaining = r - l + 1;
            sb.append((n - remaining) / 2).append("\n");
        }
        
        System.out.print(sb);
        scanner.close();
    }
}