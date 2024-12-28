import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a  = scanner.nextInt();
        int b  = scanner.nextInt();

        try{
            System.err.println(a/b);
        }
        catch(ArithmeticException e){
            System.err.println("kjghalghfdba");
        }
    }
} 