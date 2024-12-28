public class Person {
    int age;
    public void print(){
        System.out.println(age);
    }
    Person(int age){
        this.age=age;
    }
    public static void main(String[] args) {
        Person a=new Person(34);
        a.print();
}}
