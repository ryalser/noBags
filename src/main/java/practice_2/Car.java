package practice_2;

public class Car {

    String brand;
    int year;


    //Конструктор
    public Car(String brand, int year){
        this.year = year;
        this.brand = brand;
    }

    String getBrand(){
        return this.brand;
    }

    int getYear(){
        return this.year;
    }


    void setBrand(String newBrand){
        if(newBrand == null || newBrand == ""){
            throw new IllegalArgumentException("Не указано название бренда!");

        }
        this.brand = newBrand;
    }

    void setYear(int newYear){
        if (newYear < 1900 || newYear > 2025){
            throw new IllegalArgumentException("Год автотранспорта должен быть меньше 1900 и больше 2025!");
        }

        this.year = newYear;
    }

    public void print(){
        System.out.println("Марка автомобиля: " + brand + ", Год выпуска: " + year);
    }

}
