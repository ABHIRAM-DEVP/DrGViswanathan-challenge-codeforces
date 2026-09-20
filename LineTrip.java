import java.util.Scanner;
//cf 1901 A
public class LineTrip {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            

            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            int maxDist = a[0];
            //after inputs now to calc the minimum fuel(1 fuel litre = 1 km)
            //the min fuel must be ammount by which any max dist btwn two gas station distance can be travelled

            //1 liter of gasoline per 1 unit of distance travelled
            
            for(int i=1;i<n;i++){
                maxDist = Math.max(maxDist, a[i]-a[i-1]); //for x=0 to 7 with a[0]=1, a[1]=3, a[2]=5, maxDist = max(1, 3-1) = 2, then max(2, 5-3) = 2
            }

            
            maxDist = Math.max(maxDist, 2*(x-a[n-1])); //for x=0 to 7 with a[n-1]=5, maxDist = 2*(7-5) = 4, which is greater than the previous maxDist

            System.out.println(maxDist);
        }
        
    }
}
