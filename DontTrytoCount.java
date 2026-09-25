import java.util.Scanner;
public class DontTrytoCount {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int lengthN = n; 
            int m = sc.nextInt();
            int LengthM = m;

            
            String x = sc.next();
            String s = sc.next();

            int ops = 0;

            for(int i=0; i<6; i++){ //(2^6 = 64) is the maximum number of operations we can perform to check if s can be formed by repeating x
                if(x.contains(s)){
                    break;
                }
                else{
                    x = x+x;
                    ops++;
                }
            }


            if(x.contains(s)){
                System.out.println(ops);
            }
            else{
                System.out.println("-1");
            }
        }
    }
}
