import java.util.Scanner;

public class LongestDivisorsInterval{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        
        int t = scanner.nextInt();

        
        while(t-- > 0){
            long n = scanner.nextLong();
            long count = 1;
            for(long i = 2; i <= n; i++){
                if (n % i == 0){
                    count++;
                } 
                else{
                    break;
                }
            }
            System.out.println(count);
        }
        scanner.close();
    }
}