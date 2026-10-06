import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GrasshopperonaLine{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            if (x % k != 0) {
                sb.append(1).append("\n");
                sb.append(x).append("\n");
            } 
            else {
                sb.append(2).append("\n");
                sb.append((x - 1)).append(" ").append(1).append("\n");
            }
        }
        
        
        System.out.print(sb);
    }
}