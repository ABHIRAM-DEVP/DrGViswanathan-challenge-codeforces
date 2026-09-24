import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class DoremysPaint3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            //if one element or two elements then its possible to rearrange and make adjacent elements sum equal

            //if 3 elements: with 2 distinct still possible to rearrange and make adjacent elements sum equal,
            
            //but with 3 distinct elements its not possible to rearrange and make adjacent elements sum equal
            // 1 2 3 => 1+2=3, 2+3=5, 3+1=4 => not equal

            //for 4 distinct elements not possible but 2 distinct and n=4 its possible
            //like 2 4 2 4 

            int n = sc.nextInt();
            Map<Integer, Integer>map = new HashMap<>();
            for(int i=0; i<n; i++){
                int x = sc.nextInt();
                map.put(x, map.getOrDefault(x,0)+1);
            }
            //check size 
            if(map.size()==1){
                System.out.println("YES");
            }
            else if(map.size()==2){

                List<Integer>countOfElements = new ArrayList<>(map.values());
                int diff = Math.abs(countOfElements.get(0)- countOfElements.get(1));
                if(diff==0 || diff==1){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }

            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }

    
}

//if 3 distinct elements and size =6
//1 2 3 1 2 3 - no possible to rearrange and make adjacent elements sum equal