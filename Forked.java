import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Forked{
    static class Point {
        long x, y;

        Point(long x, long y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Long.hashCode(x) * 31 + Long.hashCode(y);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();

        int[] dx = { -1, 1, -1, 1, -2, -2, 2, 2 };
        int[] dy = { -2, -2, 2, 2, -1, 1, -1, 1 };

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();

            long xk = scanner.nextLong();
            long yk = scanner.nextLong();

            long xq = scanner.nextLong();
            long yq = scanner.nextLong();

            Set<Point> kingMoves = new HashSet<>();
            Set<Point> queenMoves = new HashSet<>();

            for (int i = 0; i < 8; i++) {
                long nx = xk + dx[i] * (i < 4 ? a : b);
            }

            long[] offsetsX = {a, a, -a, -a, b, b, -b, -b};
            long[] offsetsY = {b, -b, b, -b, a, -a, a, -a};

            for (int i = 0; i < 8; i++) {
                kingMoves.add(new Point(xk + offsetsX[i], yk + offsetsY[i]));
                queenMoves.add(new Point(xq + offsetsX[i], yq + offsetsY[i]));
            }

            int commonPositions = 0;
            for (Point p : kingMoves) {
                if (queenMoves.contains(p)) {
                    commonPositions++;
                }
            }

            sb.append(commonPositions).append("\n");
        }


        
        System.out.print(sb);
        scanner.close();
    }
}