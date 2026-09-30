import java.util.Scanner;
public class SequenceGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int[] b = new int[n];
            for(int i=0; i<n; i++){
                b[i] = sc.nextInt();
            }
            StringBuilder sb = new StringBuilder();
            int count = 1;
            sb.append(b[0]);

            for (int i = 1; i < n; i++) {
                if (b[i] < b[i - 1]) {
                    sb.append(" ").append(1);
                    count++;
                }

                
                sb.append(" ").append(b[i]);
                count++;
            }

            System.out.println(count);
            System.out.println(sb.toString());
        }
        sc.close();
        
    }
}
