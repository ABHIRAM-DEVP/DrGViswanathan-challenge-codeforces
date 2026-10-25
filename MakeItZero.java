import java.util.Scanner;

public class MakeItZero{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {

            
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            if (n % 2 == 0) {
                sb.append(2).append("\n");
                sb.append("1 ").append(n).append("\n");
                sb.append("1 ").append(n).append("\n");
            } else {
                sb.append(4).append("\n");
                sb.append("1 ").append(n - 1).append("\n");
                sb.append("1 ").append(n - 1).append("\n");
                sb.append("2 ").append(n).append("\n");
                sb.append("2 ").append(n).append("\n");
            }
        }
        System.out.print(sb);
    }
}