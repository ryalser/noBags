package complex_task_2.URL_shortening_libraries;

import java.util.HashMap;
import java.util.Map;

public class UrlStorage {
    private static UrlStorage instance;
    private Map<String,String> storage = new HashMap<>();

    private UrlStorage(){}

    public static UrlStorage getInstance(){
        if(instance == null){
            instance = new UrlStorage();
        }
        return instance;
    }

    public void saveUrl(String shortUrl, String longUrl){
        storage.put(shortUrl,longUrl);
    }

    public String getLongUrl(String shortUrl){
        return storage.get(shortUrl);
    }

    public boolean containsUrl(String shortUrl){
        return storage.containsKey(shortUrl);
    }
}
