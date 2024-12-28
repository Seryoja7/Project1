import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Fraction fraction = new Fraction(9, 3);
        Fraction fraction1 = new Fraction(5, 6);
        fraction.add(fraction1);
        fraction.print();
    }
}