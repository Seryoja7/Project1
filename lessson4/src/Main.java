import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        if (A == 0) {
            if (B > 0) {
                System.out.println("any x");
            } else {
                System.out.println("no such x");
            }
        } else {
            if (A > 0) {
                if (B >= 0) {
                    System.out.println("any x");
                } else {
                    double x1 = -B / A;
                    System.out.printf("x>%.1f%n", x1);
                }
            } else {
                if (B >= 0) {
                    System.out.println("no such x");
                } else {
                    double x1 = -B / A;
                    System.out.printf("x<%.1f or x>%.1f%n", x1, -x1);
                }
            }
        }
    }
}