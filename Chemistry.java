import java.util.Scanner;

public class Chemistry{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        while (t-- > 0){

            
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            String s = scanner.next();
    
            int[] freq = new int[26];

            for (int i = 0; i < n; i++) {
                freq[s.charAt(i) - 'a']++;
            }
            int oddCount = 0;
            for (int i = 0; i < 26; i++) {
                if (freq[i] % 2 != 0) {
                    oddCount++;
                }
            }
            if(oddCount - 1 <= k){
                System.out.println("YES");
            } 

            else{
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}