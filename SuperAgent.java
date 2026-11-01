import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] grid = new char[3][3];
        
        for (int i = 0; i < 3; i++) {
            String line = scanner.next();
            for (int j = 0; j < 3; j++) {
                grid[i][j] = line.charAt(j);
            }
        }
        
        boolean isSymmetric = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] != grid[2 - i][2 - j]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) {
                break;
            }
        }
        
        if (isSymmetric) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
