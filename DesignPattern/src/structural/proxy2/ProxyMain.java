package structural.proxy2;

public class ProxyMain {
    public static void main(String[] args) {
        String url = "";
        FileDownloaderProxy proxy = new FileDownloaderProxy(url);
        proxy.download();
    }
}
