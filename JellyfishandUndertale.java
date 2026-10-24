import java.util.Scanner;

public class JellyfishandUndertale {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        StringBuilder output = new StringBuilder();
        
        while (t-- > 0){

            
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            int n = scanner.nextInt();
            long totalTime = b;
            
            for (int i = 0; i < n; i++){
                long x = scanner.nextLong();
                totalTime += Math.min(x, a - 1);
            }
            output.append(totalTime).append("\n");
        }
        System.out.print(output);
        scanner.close();
    }
}