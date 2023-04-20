package structural.proxy2;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class FileDownloader implements Downloader{
    String path;
    public FileDownloader(String path) {
        this.path = path;
    }


    @Override
    public void download(String useragent, String url) {
        try {
            InputStream input = new URL(url).openStream();
            OutputStream os = new FileOutputStream(path);
            byte[] buffer = new byte[4096];
            int byteRead = -1;
            while ((byteRead = input.read(buffer)) != -1) {
                os.write(buffer, 0, byteRead);
            }
            input.close();
            os.close();
            System.out.println("Finish download!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
