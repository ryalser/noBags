package complex_task_2.URL_shortening_libraries;

public class Main{
    public static void main(String[] args) {
        //Создаем сервис со стратегией Base62
        UrlShortenerService serviceBase62 = new UrlShortenerService(
                new ShortenerFactory(new Base62Strategy()) {
                }
        );


        // Сокращаем URL
        String shortUrl = serviceBase62.shortenUrl("https://chat.deepseek.com/a/chat/s");
        System.out.println("Сокращенный URL: " + shortUrl); // Получаем короткий URL
        System.out.println(serviceBase62.longUrl(shortUrl)); // Получаем длинный по ключу(короткий URL) URL
        System.out.println("Существует ли такой URL в хранилище: " +
                serviceBase62.containsUrl(shortUrl.toString()));
    }
}
