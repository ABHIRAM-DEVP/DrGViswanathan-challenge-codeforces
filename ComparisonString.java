import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ComparisonString{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        

        
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            int maxLen = 1;
            int currentLen = 1;
            
            for (int i = 1; i < n; i++){
                if(s.charAt(i) == s.charAt(i - 1)){
                    currentLen++;
                } 
                else{
                    currentLen = 1;
                }
                maxLen = Math.max(maxLen, currentLen);
            }
            sb.append(maxLen + 1).append("\n");
        }
        System.out.print(sb);
    }
}