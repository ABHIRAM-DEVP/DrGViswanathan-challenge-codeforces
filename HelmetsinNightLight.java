import java.util.Arrays;
import java.util.Scanner;

public class HelmetsinNightLight{
    static class Resident implements Comparable<Resident> {
        int a;
        int b;

        Resident(int a, int b){
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Resident other){
            return Integer.compare(this.b, other.b);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long p = sc.nextLong();

            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }

            Resident[] residents = new Resident[n];
            for (int i=0; i<n; i++){
                int b = sc.nextInt();
                residents[i] = new Resident(a[i], b);
            }

            Arrays.sort(residents);


            long totalCost = p;
            long notifiedCount = 1;

            for (int i = 0; i < n; i++) {
                if (notifiedCount == n) {
                    break;
                }

                if (residents[i].b >= p) {
                    break;
                }

                long remaining = n - notifiedCount;
                long take = Math.min((long) residents[i].a, remaining);

                totalCost += take*residents[i].b;
                notifiedCount += take;
            }

            if(notifiedCount < n){
                totalCost += (n-notifiedCount)*p;
            }

            System.out.println(totalCost);
        }
        sc.close();
    }
}

//time complexity: O(nlogn)
//space complexity: O(n)