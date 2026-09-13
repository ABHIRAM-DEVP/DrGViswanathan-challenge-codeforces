import java.util.Scanner;

public class SwapandDelete{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        while(t-- >0){
            String s = sc.next();
            int c0 = 0, c1 = 0;
            
            for(int i= 0; i<s.length(); i++) {
                if(s.charAt(i) == '0'){
                    c0++;
                } 
                else{
                    c1++;
                }
            }
            
            int ans = 0;
            for(int i=0; i< s.length(); i++){
                if(s.charAt(i) == '0'){
                    if(c1 > 0){
                        c1--;
                    } 
                    else{
                        ans = s.length()-i;
                        break;
                    }
                } 
                else{
                    if(c0 > 0){
                        c0--;
                    } 
                    else{
                        ans = s.length()-i;
                        break;
                    }
                }
            }
            
            System.out.println(ans);
        }
        
        sc.close();
    }
}
//time complexity:O(n)
//space complexity:O(1)
