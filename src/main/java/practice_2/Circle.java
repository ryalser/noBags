package practice_2;

public class Circle {

    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    int getRadius(){
        return this.radius;
    }

    void setRadius(int newRadius){
        this.radius = newRadius;
    }

    //Вычисление площади
    public double calculateArea(){
        return Math.PI * (radius * radius);
    }


    //Вычисление окружности
    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }

}
