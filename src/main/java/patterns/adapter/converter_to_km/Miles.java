package patterns.adapter.converter_to_km;

public class Miles implements Distance {

    private int miles;

    public Miles(int miles){
        this.miles = miles;
    }

    public int getMiles() {
        return miles;
    }

    @Override
    public double distance(){
        return miles;
    }
}
