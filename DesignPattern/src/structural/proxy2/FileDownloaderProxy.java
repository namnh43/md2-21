package structural.proxy2;

public class FileDownloaderProxy implements Downloader{
    private String url;
    private UserAgent userAgent;//In real, it should be a java object support download file
    FileDownloader fileDownloader;

    public FileDownloaderProxy(String url) {
        this.url = url;
        this.userAgent = new UserAgent();
        fileDownloader = new FileDownloader(url, userAgent);
    }

    @Override
    public void download() {
        //validate url, if not valid then not call download function
        //else
        fileDownloader.download();
    }
}
