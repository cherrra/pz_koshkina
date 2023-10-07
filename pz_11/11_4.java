import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		king_step(x1, y1, x2, y2);
}
       static void king_step(int x1, int y1, int x2, int y2) {
        if (x1 < 0 || x1 > 7 || y1 < 0 || y1 > 7) {
            System.out.println("1");
        } else if (x2 < 0 || x2 > 7 || y2 < 0 || y2 > 7) {
            System.out.println("2");
        } else if (x1 == x2 && y1 == y2) {
            System.out.println("3");
        } else if (Math.abs(x1 - x2) <= 1 && Math.abs(y1 - y2) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
