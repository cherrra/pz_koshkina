public class Main {
    public static void main(String[] args) {
        int n = 5;
        simple(n);
    }

    public static void simple(int n) {
        boolean prostoe = true;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                prostoe = false;
                break;
            }
        }
        if(prostoe) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
