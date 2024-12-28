import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int koaf= scanner.nextInt();
        Shape [] arr=new Shape[3];
        arr [0] =new Tringle();
        arr[1]= new Rectangle();
        arr[2] =new Circle();
        for (int i=0;i< arr.length;i++){
            arr[i].color();
        }

        Rectangle rect1=new Rectangle();
        rect1.width=4;
        rect1.height=5;
        System.out.println(rect1.area());
        rect1.increase(koaf);
        System.out.println(rect1.area());
    }
}