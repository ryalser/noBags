package complex_task_2.URL_shortening_libraries;

public class UrlShortenerService {
    private ShorteningStrategy strategy;
    private UrlStorage storage;

    public UrlShortenerService(ShortenerFactory factory){
        this.strategy = factory.createStrategy();
        this.storage = UrlStorage.getInstance();
    }

    // Получить сокращенный URL
    public String shortenUrl(String longUrl){
        String shortUrl1 = strategy.shorten(longUrl);

        storage.saveUrl(shortUrl1, longUrl);
        return shortUrl1;
    }

    // Получить исходный URL
    public String longUrl(String shortUrl){
        return storage.getLongUrl(shortUrl);
    }

    // Проверить существует ли такой URL?
    public boolean containsUrl(String shortUrt){
        return storage.containsUrl(shortUrt);
    }
}
