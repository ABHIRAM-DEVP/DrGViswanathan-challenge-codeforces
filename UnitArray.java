import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UnitArray{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int pos = 0, neg = 0;
            for (int i = 0; i < n; i++) {
                int val = Integer.parseInt(st.nextToken());
                if (val == 1) {
                    pos++;
                } else {
                    neg++;
                }
            }
            
            int operations = 0;
            

            while (pos < neg){
                pos++;
                neg--;
                operations++;
            }
            
            
            if (neg % 2 != 0){
                operations++;
            }
            
            sb.append(operations).append("\n");
        }
        System.out.print(sb);
    }
}