public class Fraction {
    private  int num;
    private  int denum = 1;
    public  Fraction(int num, int denum)
    {
        if(denum == 0)
        {
            System.out.println("Denum can not be 0");
            return;
        }
        this.num = num;
        this.denum = denum;
        reduce();
    }
    public  Fraction(){}
    public void setNum(int num)
    {
        this.num = num;
    }
    public void setDenum(int denum)
    {
        if(denum == 0)
        {
            System.out.println("Denum can not be 0");
            return;
        }
        this.denum = denum;
    }
    public void add(Fraction extFraction)
    {
        num = num* extFraction.denum + denum* extFraction.num ;
        denum = denum * extFraction.denum;
        reduce();
    }
    public void sub(Fraction extFraction)
    {
        num = num* extFraction.denum - denum* extFraction.num;
        denum = denum * extFraction.denum;
        reduce();
    }
    public void multiply(Fraction extFraction)
    {
        num *= extFraction.num;
        denum*= extFraction.denum;
        reduce();
    }
    public void division(Fraction extFraction)
    {
        if(extFraction.num == 0)
        {
            System.out.println("You can not divide on 0");
        }
        num *= extFraction.denum;
        denum*= extFraction.num;
        reduce();
    }
    public void print()
    {
        if(denum == 1)
        {
            System.out.println(num);
        }
        if (num ==0) {
            System.out.println("0");
        }
        if(num > denum && denum != 1)
        {
            System.out.println("    " + Math.abs(num/denum));
            System.out.println((num * denum < 0?"-":"+") +  (num / denum) + "-----");
            System.out.println("    " + Math.abs(denum));
            System.out.println("Or:" + ((double)num/denum));
        }if(denum != 1 && num < denum)
        {
            System.out.println("   " + Math.abs(num));
            System.out.println((num * denum < 0?"-":"+") +  "-----");
            System.out.println("   " + Math.abs(denum));
            System.out.println("Or:" + ((double)num/denum));
        }
    }
    private  void reduce()
    {
        int gcd = gcd();
        num/=gcd;
        denum/=gcd;
    }
    private  int gcd()
    {
        int tmp;
        int n;
        int d;
        if (num < denum)
        {
            n = num;
            d = denum;
        }
       else
        {
            n = denum;
            d = num;
        }
        while (n != 0)
        {
            tmp = n;
            n = d % n;
            d = tmp;

        }
        return  d;
    }
}
