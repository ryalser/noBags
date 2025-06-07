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
        return getYear();
    }


    void setBrand(String newBrand){
        this.brand = newBrand;
    }

    void setYear(int newYear){
        this.year = newYear;
    }

    public void print(){
        System.out.println("Марка автомобиля: " + brand + ", Год выпуска: " + year);
    }

}
