import java.util.Scanner;
public class CoverInWater{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        //if continuous 3 in row then 2 ops
        //op1 - place water
        //op2 - remove water
//if 3 consecutive so there is infintie propagation of water so 2 ops needed as i-1 and i+1 will be filled with water and then we can remove the water from i-1 and i+1
        while(t-->0){
            int n = sc.nextInt(); //number of cells
            String s = sc.next(); //string of cells
            int consecutiveCount = 0;
            int actions = 0;
            boolean hasThree = false;

            
            for(int i=0; i<n; i++){
                if(s.charAt(i)=='.'){
                    consecutiveCount++;
                    actions++;
                    if(consecutiveCount>=3){
                        hasThree = true;
                        break;
                    }
                }
                
                else{
                    consecutiveCount=0;
                }
                
            }
            if (hasThree) {
                System.out.println(2);
            } else {
                System.out.println(actions);
            }
        }
    }
}