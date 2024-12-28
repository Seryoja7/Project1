public class Vector2D {
    public double vX;
    public double vY;
    public int count = 0;
    public Vector2D() {
        this.vX = 1;
        this.vY = 1;
        count++;
    }
    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
        count++;
    }
    public Vector2D(Vector2D vector) {
        this.vX = vector.vX;
        this.vY = vector.vY;
        count++;
    }
    public void print() {
        System.out.println(String.format( "(%.2f, %.2f)", vX, vY));
    }
    public double length() {
        return Math.sqrt(vX * vX + vY * vY);
    }
    public void add(Vector2D v) {
        this.vX += v.vX;
        this.vY += v.vY;
    }
    public void sub(Vector2D v) {
        this.vX -= v.vX;
        this.vY -= v.vY;
    }
    public void scale(double scaleFactor) {
        this.vX *= scaleFactor;
        this.vY *= scaleFactor;
    }
    public Vector2D normalized() {
        double len = length();
        if (len == 0) {
            return new Vector2D(0, 0);
        }
        return new Vector2D(vX / len, vY / len);
    }
    public double dotProduct(Vector2D v) {
        return this.vX * v.vX + this.vY * v.vY;
    }
}