package structural.proxy;

public class CalculatorProxy implements Calculator{
    private RealCalculator realCalculator;
    private static CalculatorProxy instance;

    private CalculatorProxy() {
        realCalculator = new RealCalculator();
    }
    public static synchronized CalculatorProxy getInstance(){
        if(instance == null) {
            instance = new CalculatorProxy();
        }
        return instance;
    }
    @Override
    public double add(double x1, double x2) {
        return realCalculator.add(x1,x2);
    }

    @Override
    public double sub(double x1, double x2) {
        return realCalculator.sub(x1,x2);
    }

    @Override
    public double mul(double x1, double x2) {
        return realCalculator.mul(x1,x2);
    }

    @Override
    public double div(double x1, double x2) {
        if (x2 == 0) {
            throw new IllegalArgumentException("Divide by 0");
        }
        return realCalculator.div(x1,x2);
    }
}
