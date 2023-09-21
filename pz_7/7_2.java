import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stroka = scanner.nextLine();
        int n = scanner.nextInt();
        String[] nums = stroka.split(" ");
        int findex = -1;
        int lindex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i].equals(Integer.toString(n))) {
                if (findex == -1) {
                    findex = i;
                }
                lindex = i;
            }
        }
        System.out.println("индекс первого вхождения числа " + n + ": " + findex + "\n" + "и последнего вхождения: " + lindex);
    }
}
