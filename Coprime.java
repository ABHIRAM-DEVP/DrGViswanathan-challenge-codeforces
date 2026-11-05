import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Coprime{
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        

        int[] maxIdx = new int[1001];

        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Arrays.fill(maxIdx, 0);
            
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                int val = Integer.parseInt(st.nextToken());
                maxIdx[val] = i; 
            }
            
            int maxSum = -1;
            
            for (int i = 1; i <= 1000; i++) {
                if (maxIdx[i] == 0) continue;
                for (int j = i; j <= 1000; j++) {
                    if (maxIdx[j] == 0) continue;
                    
                    if (gcd(i, j) == 1) {
                        maxSum = Math.max(maxSum, maxIdx[i] + maxIdx[j]);
                    }
                }
            }
            
            sb.append(maxSum).append("\n");
        }
        
        System.out.print(sb);
    }
}
