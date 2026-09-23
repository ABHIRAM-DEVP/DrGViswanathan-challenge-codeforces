import java.util.Scanner;
public class JaggedSwaps {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0){

            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i]= sc.nextInt();
            }
            //swap a[i] and a[i+1] if a[i] > a[i+1] : 
            //flag of  isSorted = true until a[i]>a[i-1]
            boolean isSorted = true;
            for(int i=1; i<n-1; i++){
                if(a[0]!=1){
                    isSorted = false;
                    break;
                }
                //we just check if a[0]==1 or i,e like a[0] is the smallest element in the array, then we can swap it with a[1] and make it sorted

                //and swap of a[i] and a[i+1] is allowed only 
            }

            if(isSorted){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
