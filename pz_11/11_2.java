import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		System.out.println("Секунд прошло: " + second_count(d, h, m, s));
		
	}
	
	public static int second_count(int d, int h, int m, int s) {
	    int sec = 0;
	    sec += d * 24 *60 * 60;
	    sec += h * 60 * 60;
	    sec += m * 60;
	    sec += s;
	    return sec;
	}
}
