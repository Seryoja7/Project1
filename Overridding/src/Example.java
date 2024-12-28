import java.lang.Override;

public class Parent {
    public void method(int argument) {
        System.out.println("Parent" + argument);
    }
}

public class Child{
    @Override
    public void method(int argument){
        System.out.println("Child"+argument);
    }

}

Parent obj1 = new Parent();
Child obj2 = new Child();
Obj1.method(1);
obj2.method(2);

