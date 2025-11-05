package patterns.adapter.converter_to_km;

public class MilesToKilometersAdapter implements Distance {

    private Kilometers km;

    public MilesToKilometersAdapter(Kilometers km){
        this.km = km;
    }

    @Override
    public double distance(){
        double distanceToMiles = km.getKm() * 0.621371;
        return distanceToMiles;
    }
}
