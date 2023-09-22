import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String word = scanner.next();
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        int maxCount = 0;
        String slovo = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                slovo = entry.getKey();
            }
        }
        System.out.println("Чаще всего повторяется слово: " + slovo);
    }
}
