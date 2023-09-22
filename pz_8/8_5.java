import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> stack = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String command = scanner.next();
            if (command.equals("push")) {
                String item = scanner.next();
                stack.add(item);
            } else if (command.equals("pop")) {
                String item = stack.remove(stack.size()-1);
                System.out.println("Петя взял " + item);
            }
        }
        for (int i = stack.size()-1; i >= 0; i--) {
            System.out.print(stack.get(i) + " ");
        }
    }
}
