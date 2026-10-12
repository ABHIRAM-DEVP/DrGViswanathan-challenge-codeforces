import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WalkingMaster{
    public static void main(String[] args) throws IOException{


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        
        int t = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-- > 0){
            if(st == null || !st.hasMoreTokens()){
                st = new StringTokenizer(reader.readLine());
            }
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long c = Long.parseLong(st.nextToken());
            long d = Long.parseLong(st.nextToken());
            if (b>d || (d-b) < (c-a)){
                sb.append("-1\n");
            } 
            else{
                long moves = 2*(d-b)+(a-c);
                sb.append(moves).append("\n");
            }
        }
        System.out.print(sb);
    }
}