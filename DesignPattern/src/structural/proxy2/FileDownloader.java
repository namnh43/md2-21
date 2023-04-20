package structural.proxy2;

public class FileDownloader implements Downloader{
    String url;
    UserAgent userAgent;

    public FileDownloader(String url, UserAgent userAgent) {
        this.url = url;
        this.userAgent = userAgent;
    }

    @Override
    public void download() {
        //Do something to download file from url by user-agent
        System.out.println("Download file & save file to disk!!!");
    }
}
