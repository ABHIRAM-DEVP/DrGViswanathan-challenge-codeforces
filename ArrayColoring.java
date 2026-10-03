import java.util.*;
public class ArrayColoring{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){

            
            int n = sc.nextInt();
            int odd =0;
            int even =0;
            for(int i=0; i<n; i++){
                int a = sc.nextInt();
                if(a%2 ==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
            if(odd%2==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}