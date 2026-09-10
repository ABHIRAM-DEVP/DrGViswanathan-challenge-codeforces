import java.util.Scanner;

public class ThreeIndices{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];
            
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }
            
            boolean found = false;
            for (int i=1; i < n-1; i++) {
                if (p[i]>p[i-1] && p[i]>p[i+1]){
                    System.out.println("YES");
                    System.out.println((i)+" "+(i+1)+" "+(i+2));
                    found = true;
                    break;
                }
            }
            
            if(!found){
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

//time complexity: O(n)
//space complexity: O(n)