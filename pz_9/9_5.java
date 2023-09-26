import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        String winnerName = "";
        int maxWordCount = 0;
        
        System.out.println("Введите k: ");
        int k = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Введите строки: ");
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(": ");
            String name = parts[0];
            String[] words = parts[1].split(", ");

            int validWordCount = 0;
            for (String word : words) {
                if (word.length() >= k) {
                    validWordCount++;
                }
            }

            if (validWordCount > maxWordCount) {
                maxWordCount = validWordCount;
                winnerName = name;
            }
        }

        System.out.println(winnerName + ": " + maxWordCount);

        scanner.close();
    }
}
