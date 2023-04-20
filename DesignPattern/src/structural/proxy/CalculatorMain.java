package structural.proxy;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first and second num:");
        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        //output
        System.out.println("Sum:"+CalculatorProxy.getInstance().add(x1, x2));
        System.out.println("Sub:"+CalculatorProxy.getInstance().sub(x1, x2));
        System.out.println("Mul:"+CalculatorProxy.getInstance().mul(x1, x2));
        System.out.println("Div:"+CalculatorProxy.getInstance().div(x1, x2));

    }
}
