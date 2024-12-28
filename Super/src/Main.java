public class Main {
    public static void main(String[] args) {
        Stusdent Poghos = new Stusdent();
        Stusdent Petros = new Stusdent(23);
        System.out.println(Poghos.age);
        Poghos.print();
        Petros.print();
    }
}