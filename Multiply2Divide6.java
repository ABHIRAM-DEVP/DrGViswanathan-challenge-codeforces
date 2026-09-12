import java.util.Scanner;
import java.io.PrintWriter;

public class Multiply2Divide6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        if(sc.hasNextInt()){
            int t = sc.nextInt();
            while(t-- >0){
                long n = sc.nextLong();
                int cnt2 = 0;
                int cnt3 = 0;

                while(n % 2 == 0) {
                    cnt2++;
                    n /= 2;
                }

                while (n % 3 == 0) {
                    cnt3++;
                    n /= 3;
                }

                if (n > 1 || cnt2 > cnt3) {
                    out.println(-1);
                } else {
                    out.println(2 * cnt3 - cnt2);
                }
            }
        }

        out.flush();
        sc.close();
    }
}
//time complexity: O(log n)
//space complexity: O(1)