import java.util.Scanner;

public class Game01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while(t-- >0){
            String s = sc.next();
            int zeros = 0;
            int ones = 0;
            
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='0'){
                    zeros++;
                } 
                else{
                    ones++;
                }
            }
            
            int moves = Math.min(zeros, ones);
            
            if(moves%2 !=0){
                System.out.println("DA");
            } 
            else{
                System.out.println("NET");
            }
        }
        sc.close();
    }
}
//time complexity: O(n)
//space complexity: O(1)