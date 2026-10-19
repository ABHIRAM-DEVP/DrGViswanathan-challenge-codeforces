import java.util.Scanner;

public class ExtremelyRound{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;

        int t = scanner.nextInt();

        
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0){
            int n = scanner.nextInt();
            int count = 0;
            
            for (int d = 1; d <= 9; d++){
                int val = d;
                while (val <= n){
                    count++;
                    val *= 10;
                }
            }
            sb.append(count).append("\n");
        }
        
        System.out.print(sb);
        scanner.close();
    }
}