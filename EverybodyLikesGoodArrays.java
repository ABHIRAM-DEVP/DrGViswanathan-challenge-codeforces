import java.util.Scanner;

public class EverybodyLikesGoodArrays{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0){
            int n = scanner.nextInt();
            int operations = 0;
            int prev = scanner.nextInt();
            for(int i = 1; i < n; i++){
                int curr = scanner.nextInt();
                if ((prev % 2) == (curr % 2)){
                    operations++;
                }
                prev = curr;

                
            }
            sb.append(operations).append("\n");
        }
        System.out.print(sb);
        scanner.close();
    }
}