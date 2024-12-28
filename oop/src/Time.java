import java.util.Scanner;
public class Time {
    private int milliseconds;
    void tick(){
        milliseconds++;
    }
    void print(){
        int seconds=milliseconds/1000;
        System.out.printf("%d seconds, %d ms",seconds,milliseconds%1000);
    }
    void many(int n){
        for (int i =0;i<n;i++){
            milliseconds++;
        }
    }
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        Time timeer=new Time();
        Time time = new Time();
        Time timeer2=new Time();
        for(int i =0;i<7689;i++){
            timeer.tick();
            time.tick();
            time.tick();
        }
        timeer2.many(n);
        timeer2.print();
        System.out.println();
        time.print();
        System.out.println();
        timeer.print();
    }
}
