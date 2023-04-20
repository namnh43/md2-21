package structural.proxy;

public class RealCalculator implements Calculator{
    double x1,x2;

    public RealCalculator(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public RealCalculator() {

    }

    @Override
    public double add(double x1, double x2) {
        return x1+x2;
    }

    @Override
    public double sub(double x1, double x2) {
        return x1-x2;
    }

    @Override
    public double mul(double x1, double x2) {
        return x1*x2;
    }

    @Override
    public double div(double x1, double x2) {
        return x1/x2;
    }
}
