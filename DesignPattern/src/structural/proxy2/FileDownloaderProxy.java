package structural.proxy2;

public class FileDownloaderProxy implements Downloader{
    private String userAgent;//In real, it should be a java object support download file
    private String path;
    FileDownloader fileDownloader;

    public FileDownloaderProxy(String path) {
        this.path = path;
    }

    @Override
    public void download(String useragent, String url) {
        if (fileDownloader == null) {
            fileDownloader = new FileDownloader(path);
        }
        //Validate user agent
        fileDownloader.download(useragent, url);
    }
}
