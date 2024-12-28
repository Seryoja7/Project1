import java.lang.Override;

public class Child extends Parent{
    @Override
    public void method(int argument){
        System.out.println("Child "+argument);
    }
}
