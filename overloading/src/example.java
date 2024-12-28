public class example {
    public void print() {
        System.out.println("Default print");
    }

    public void print(int index) {
        System.out.println("Index is " + index);
    }

    public void print(double coefficient) {
        System.out.println("Coefficient is " + coefficient);
    }

    public void print(int index, double coefficient) {
        System.out.printf("Index: %d, coefficient: %f ", index, coefficient);
    }

}
