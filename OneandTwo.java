import java.util.Scanner;

public class OneandTwo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();

        while (t-- > 0){
            int n = scanner.nextInt();
            int[] a = new int[n];
            int totalTwos = 0;


            
            for (int i = 0; i < n; i++){
                a[i] = scanner.nextInt();
                if (a[i] == 2) {
                    totalTwos++;
                }
            }
            if(totalTwos % 2 != 0){
                System.out.println(-1);
                continue;
            }

            if(totalTwos == 0){
                System.out.println(1);
                continue;
            }

            int targetTwos = totalTwos / 2;
            int currentTwos = 0;
            int ans = -1;

            for (int i = 0; i < n - 1; i++){
                if (a[i] == 2) {
                    currentTwos++;
                }
                if (currentTwos == targetTwos){
                    ans = i + 1; 
                    break;
                }
            }

            System.out.println(ans);
        }
        scanner.close();
    }
}