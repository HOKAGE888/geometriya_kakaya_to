public class Rectangle implements Shape {
    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public static void calculateArea() {
        double S = this.length * this.width;
        return S;
    }

    public static void calculatePerimeter() {
        double P = 2.0 * (this.width + this.length);
        return P;
    }
}
