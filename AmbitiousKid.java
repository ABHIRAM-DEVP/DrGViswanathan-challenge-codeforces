import java.util.Scanner;
public class AmbitiousKid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // for product of all items=0, just one item must be 0
        int mini = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            
            
            int num = sc.nextInt();
            int posNum = Math.abs(num);

            if(posNum < mini){
                mini = posNum;
            }
            
        }
        System.out.println(mini);
        sc.close();
    }
}
