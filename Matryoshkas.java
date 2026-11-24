import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Matryoshkas{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;

        int t = Integer.parseInt(line.trim());
        StringBuilder out = new StringBuilder();
        StringTokenizer st = null;

        while (t-- > 0) {
            while (st == null || !st.hasMoreTokens()) {
                String l = br.readLine();
                if (l == null) break;
                st = new StringTokenizer(l);
            }
            int n = Integer.parseInt(st.nextToken());

            TreeMap<Integer, Integer> freq = new TreeMap<>();
            int read = 0;
            while (read < n) {
                while (st == null || !st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
                int val = Integer.parseInt(st.nextToken());
                read++;
                freq.put(val, freq.getOrDefault(val, 0) + 1);
            }

            int sets = 0;
            Integer prevSize = null;
            int prevCount = 0;

            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                int size = entry.getKey();
                int count = entry.getValue();

                if (prevSize == null || size != prevSize + 1) {
                    sets += count;
                } else if (count > prevCount) {
                    sets += count - prevCount;
                }

                prevSize = size;
                prevCount = count;
            }

            out.append(sets).append('\n');
        }

        System.out.print(out);
    }
}
