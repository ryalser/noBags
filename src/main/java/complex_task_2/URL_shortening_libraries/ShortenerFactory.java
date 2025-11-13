package complex_task_2.URL_shortening_libraries;

public class ShortenerFactory {
    private ShorteningStrategy strategy;


    public ShortenerFactory(ShorteningStrategy strategy){
        this.strategy = strategy;
    }

    public ShorteningStrategy createStrategy(){
        return strategy;
    }
}
