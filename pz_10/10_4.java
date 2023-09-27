import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "хочу домой господи как надоело";
        System.out.println(sortirovka(str));
    }

    public static String sortirovka(String str) {
        String[] words = str.split(" ");
        Arrays.sort(words, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            } else {
                return Integer.compare(a.length(), b.length());
            }
        });
        return String.join(" ", words);
    }
}
