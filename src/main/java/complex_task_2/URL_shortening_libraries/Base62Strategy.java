package complex_task_2.URL_shortening_libraries;

public class Base62Strategy implements ShorteningStrategy {
    private String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";


    @Override
    public String shorten(String longUrl){
        // Получаем хеш код URL и берем его по модулю (положительное число)
        int hash = Math.abs(longUrl.hashCode());
        StringBuilder result = new StringBuilder();

        // Конвертируем число в Base62
        while (hash > 0){
            result.append(chars.charAt(hash % 62));
            hash /= 62;
        }
        return result.toString();
    }
}
