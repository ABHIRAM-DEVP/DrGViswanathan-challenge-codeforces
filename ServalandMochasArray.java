import java.util.Scanner;

public class ServalandMochasArray{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();


        
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++){
                a[i] = scanner.nextInt();
            }
            
            boolean possible = false;
            
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++){
                    if(gcd(a[i], a[j]) <= 2){
                        possible = true;
                        break;
                    }
                }
                if(possible)break;
            }
            
            if (possible){
                sb.append("YES\n");
            } 
            else{
                sb.append("NO\n");
            }
        }
        System.out.print(sb);
        scanner.close();
    }
    
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}