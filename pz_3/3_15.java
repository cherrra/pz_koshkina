import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

System.out.print("Введите число от 1 до 100: ");
int x = scanner.nextInt();

String r = "";
int ostatok = x % 10;

if (x >= 10) { 
    x /= 10;
    if (x == 1) {
        r += "X";
    } else if (x == 2) {
        r += "XX";
    } else if (x == 3) {
        r += "XXX";
    } else if (x == 4) {
        r += "XL";
    } else if (x == 5) {
        r += "L";
    } else if (x == 6) {
        r += "LX";
    } else if (x == 7) {
        r += "LXX";
    } else if (x == 8) {
        r += "LXXX";
    } else if (x == 9) {
        r += "XC";
    }
}

if (ostatok == 1) {
    r += "I";
} else if (ostatok == 2) {
    r += "II";
} else if (ostatok == 3) {
    r += "III";
} else if (ostatok == 4) {
    r += "IV";
} else if (ostatok == 5) {
    r+= "V";
} else if (ostatok== 6) {
    r += "VI";
} else if (ostatok == 7) {
    r += "VII";
} else if (ostatok == 8) {
    r += "VIII";
} else if (ostatok == 9) {
    r+= "IX";
}

System.out.println(x + " в римской системе счисления: " + r);
    }
}
