package structural.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        FileCalculator fileCalculator = new FileCalculatorAdapter();
        FileCalculatorClient fileCalculatorClient = new FileCalculatorClient(fileCalculator);
        fileCalculatorClient.printFileSize("E:\\LEARN\\codegym\\c0223-m2");
    }
}
