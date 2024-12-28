public class Fraction {
    int numerator;
    int denominator;
    public Fraction(){
        denominator=1;
        System.out.println("constructor 1");
    }
    public Fraction(int value){
        numerator=value;
        denominator=value;
        System.out.println("costructor 2");
    }
    public Fraction(int num,int denom){
        numerator=num;
        denominator=denom;
        System.out.println("costructor 3");
    }
}
