import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwinPermutations{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        StringBuilder sb = new StringBuilder();
        
        while(t-->0){
            int n  = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for(int i=0; i<n; i++){
                int a = Integer.parseInt(st.nextToken());
                int b = n + 1 - a;
                sb.append(b).append(" ");

            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}