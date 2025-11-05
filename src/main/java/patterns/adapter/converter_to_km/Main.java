package patterns.adapter.converter_to_km;

public class Main {
    public static void main(String[] args) {

        // Создаем экземпляр класса Kilometers - дистанцию в КМ
        Kilometers km = new Kilometers(100);


        // Передаем адаптеру расстояние в КМ
        MilesToKilometersAdapter miles = new MilesToKilometersAdapter(km);
        System.out.println(miles.distance()); // Получаем рез-т

    }
}
