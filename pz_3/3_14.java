import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

int a = scanner.nextInt();
int b = scanner.nextInt();
int c = scanner.nextInt();

if (a > b) {
    int t = a;
    a = b;
    b = t;
}

if (b > c) {
    int t = b;
    b = c;
    c = t;
}

if (a > b) {
    int t = a;
    a = b;
    b = t;
}

System.out.println(a + " " + b + " " + c);
    }
}

