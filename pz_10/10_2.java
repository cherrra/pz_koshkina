public class Main {
    public static void main(String[] args) {
        String figure = "квадрат";
        int n = 5;
        perimeter(figure, n);
        area(figure, n);
    }

    public static void perimeter(String figure, int n) {
        int result = 0;
        if(figure.equals("квадрат")) {
            result = 4 * n;
        } else if(figure.equals("круг")) {
            result = (int) Math.ceil(2 * 3.14 * n);
        }
        System.out.println("периметр " + figure + "а: " + result);
    }

    public static void area(String figure, int n) {
        int result = 0;
        if(figure.equals("квадрат")) {
            result = n * n;
        } else if(figure.equals("круг")) {
            result = (int) Math.ceil(3.14 * n * n);
        }
        System.out.println("площадь " + figure + "а: " + result);
    }
}
