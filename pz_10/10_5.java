import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        int n = scanner.nextInt();
        int[][] arr = new int[n][];
        for (int i = 0; i < n; i++) {
            int length = scanner.nextInt();
            arr[i] = new int[length];

            for (int j = 0; j < length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int minValue = Integer.MAX_VALUE;

            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < minValue) {
                    minValue = arr[i][j];
                }
            }

            if (minValue > maxValue) {
                maxValue = minValue;
            }
        }

        System.out.println("Макс значение среди мин элементов каждой строки: " + maxValue);
    }
}
