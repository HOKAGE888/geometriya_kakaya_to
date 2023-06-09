public class Triangle implements Shape{
    private double sideA;
    private double sideB;
    private double sideC;

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public static void calculateArea() {
        double p=(this.sideA+this.sideB+this.sideC)/2.0;
        double S = Math.scrt(p*(p-this.sideA)*(p-this.sideB)*(p-this.sideC));
        return S;
    }

    public static void calculatePerimeter() {
        double P = this.sideA+this.sideB+this.sideC;
        return P;
    }
}
