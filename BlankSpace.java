import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlankSpace{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer elements = new StringTokenizer(br.readLine());
            int maxStreak = 0;
            int currentStreak = 0;
            
            for (int i = 0; i < n; i++){
                int val = Integer.parseInt(elements.nextToken());
                if (val == 0){
                    currentStreak++;
                    if(currentStreak > maxStreak){
                        maxStreak = currentStreak;
                    }
                }
                else{
                    currentStreak = 0;
                }

                
            }
            sb.append(maxStreak).append("\n");
        }
        System.out.print(sb);
    }
}
