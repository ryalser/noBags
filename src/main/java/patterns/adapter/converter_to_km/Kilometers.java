package patterns.adapter.converter_to_km;

public class Kilometers implements Distance {

    private int km;

    public Kilometers(int km){
        this.km = km;
    }

    public int getKm() {
        return km;
    }

    @Override
    public double distance(){
        return km;
    }
}
