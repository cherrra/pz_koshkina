import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] words = line.split("\\s+");
            for (String word : words) {
                set.add(word);
            }
        }
        System.out.println(set.size());
    }
}
