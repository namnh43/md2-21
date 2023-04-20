package structural.adapter;

import com.codegym.FileUtil;

import java.io.File;
import java.io.IOException;

public class FileCalculatorAdapter implements FileCalculator{

    public FileCalculatorAdapter() {

    }

    @Override
    public long calculatorFile(String filePath) {
        try {
            FileUtil fileUtil = new FileUtil();
            File file = new File(filePath);
            return fileUtil.calculateSize(file);
        }catch (RuntimeException e) {
            try {
                throw new Exception(e.getMessage());
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
