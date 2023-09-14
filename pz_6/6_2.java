import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] m = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    m[i][j] = 1;
                } else if (i > j) {
                    m[i][j] = 2;
                } else {
                    m[i][j] = 0;
                }
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
