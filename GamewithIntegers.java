import java.util.Scanner;
public class GamewithIntegers{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){

            int n = sc.nextInt();

            
            //if multiple of 3:
            //if its 6 so if Vanya moves +1 or -1 then Vova can obstruct the progress

            //but if 7 or 8 which is not a multiple of 3 then Vanya can always win by moving to a multiple of 3 and then Vova will be forced to move to a non-multiple of 3 and Vanya can keep moving to multiples of 3 until he wins

            if(n%3==0){
                System.out.println("Second");
            }
            else{
                System.out.println("First");
            }
        }    
    }
}