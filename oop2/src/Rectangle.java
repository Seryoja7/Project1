public class Rectangle extends Shape {
    public double height;
    public double width;

    double area() {
        return height * width;
    }

    void increase(double koaf) {
        height *= koaf;
        width *= koaf;
    }

    @Override
    public void color() {
        System.out.println("Rectangle color");
    }

}
