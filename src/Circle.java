public class Circle implements Shape{
    private double radius;

    public void setRadius(double radius) {

        this.radius = radius;
    }
    public double calculateArea(){
        double S = Math.PI*Math.pow(this.radius,2);
        return S;
    }
    public double calculatePerimeter(){
        double P = 2*Math.PI*this.radius;
        return P;
    }
}
