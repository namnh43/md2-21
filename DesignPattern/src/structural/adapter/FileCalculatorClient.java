package structural.adapter;

import java.io.File;

public class FileCalculatorClient {
    FileCalculator fileCalculator;

    public FileCalculatorClient(FileCalculator fileCalculator) {
        this.fileCalculator = fileCalculator;
    }

    public void printFileSize(String filePath) {
        long fileSize = fileCalculator.calculatorFile(filePath);
        System.out.println("File size: "+fileSize);
    }
}
