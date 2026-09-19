import java.util.Scanner;

public class HalloumiBoxes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for(int i=0; i<n; i++){
                a[i]= sc.nextInt();
            }
            
            if(k>=2){
                //this means there is window of space 2 or more a space to reverse array, sort it in ascending order
                System.out.println("YES");
            }
            else{
                //if k=1 window means no reverse in the, sort it one by one (check if its ascending)
                boolean checkAscend =true;
                for(int i=0; i< n-1; i++){
                    
                    if(k==1){
                        if(a[i]>a[i+1]){
                            checkAscend = false;
                            break;  
                        }
                    }
                }
                if(checkAscend){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    

        
    }
    


        
}
