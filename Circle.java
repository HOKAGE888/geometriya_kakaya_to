public class Circle implements Shape{
    private double radius;

    public void setRadius(double radius) {

        this.radius = radius;
    }
    public static void calculateArea(){
        double S = Math.PI*Math.pow(this.radius,2);
        return S;
    }
    public static void calculatePerimeter(){
        double P = 2*Math.PI*this.radius;
        return P;
    }


}
