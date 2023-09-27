public class Main
{
	public static void main(String[] args) {
	   double a = 5.0;
	   double b = 7.0;
	   double c = 3.0;
	   geron(a,b,c);
	}
	
	static void geron(double a, double b, double c) {
	    if (a + b > c && a + c > b && b + c > a) {
	        double p = (a+b+c)/2;
	        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
	        System.out.print("площадь треугольника: " + s);
	    } else {
	        System.out.print("такого реугольника не существует");
	    }
	}
}
