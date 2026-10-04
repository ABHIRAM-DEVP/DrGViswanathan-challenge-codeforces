import java.util.*;
public class Desorting {
    public static void main(String[] args){


        

        
        Scanner sc = new Scanner(System.in);
        //operation: at i element: +1 for a0 to ai and -1 for ai+1 to an

        //like for 8 11 -> 9 10 -> 10 9

        // -> is the operation

        //pattern found for all : no. of operations = [difference]/2 + 1

        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            int minDiff = Integer.MAX_VALUE;
            for(int i=1; i<n; i++){
                minDiff = Math.min(minDiff, a[i]-a[i-1]);
                if(a[i-1]>a[i]){
                    System.out.println(0);
                    break;
                }
            }


            if(minDiff>=0){
                System.out.println((minDiff)/2 +1);
            }
            
        }
        
    }
}
