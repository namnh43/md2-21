package structural.proxy2;

import java.util.Scanner;

public class ProxyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input output file:");
        String file = scanner.nextLine();
        System.out.println("Input URL:");
        String url = scanner.nextLine();
        FileDownloaderProxy proxy = new FileDownloaderProxy(file);
        proxy.download("",url);
    }
}
