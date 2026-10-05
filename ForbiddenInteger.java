import java.util.Scanner;

public class ForbiddenInteger{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            
            int x = sc.nextInt();

            if(x != 1){
                System.out.println("YES\n" + n);
                for (int i = 0; i < n; i++){
                    System.out.print("1 ");
                };
                System.out.println();
            } 
            else if(k == 1 || (n % 2 != 0 && k == 2)){
                System.out.println("NO");
            }
            else if(n % 2 == 0){
                System.out.println("YES\n" + (n / 2));
                for (int i = 0; i < n / 2; i++){
                    System.out.print("2 ");
                }
                System.out.println();
            }else{
                System.out.println("YES\n" + (n/2));
                System.out.print("3 ");
                for(int i = 0; i < (n / 2) - 1; i++){
                    System.out.print("2 ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
    


}
