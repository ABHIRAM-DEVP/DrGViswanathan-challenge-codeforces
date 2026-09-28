import java.util.Scanner;

public class TargetPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int row = 10;
            int col = 10;



            int score = 0;
            for(int i=0; i<row; i++){
                String rowStr = sc.next();

                for(int j=0; j<col; j++){
                    if (rowStr.charAt(j)== 'X'){
                        int rowDist = Math.min(i + 1, 10 - i);
                        int colDist = Math.min(j + 1, 10 - j);

                        score += Math.min(rowDist, colDist);
                    }
                    
                }
            }
            System.out.println(score);
        }
        sc.close();
    }
}
