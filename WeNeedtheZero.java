import java.util.Scanner;

public class WeNeedtheZero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            
            int ans = -1;
            for(int x = 0; x < 256; x++){
                int currentXor = 0;
                for(int i = 0; i < n; i++){
                    currentXor ^= (a[i] ^ x);
                }
                if(currentXor == 0){
                    ans = x;
                    break;
                }
            }
            System.out.println(ans);


            
        }
    }
}