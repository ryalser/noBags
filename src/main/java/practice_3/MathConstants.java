package practice_3;

public class MathConstants {


    static final double PI = 3.14159;
    static final double E = 2.71828;



    //площадь круга
    public static double calculateCircleArea(double r){

        if (r <= 0){
            throw new IllegalArgumentException("r не может быть <= 0!");
        }

        return PI * (r * r);
    }


    //длина окружности
    public static double calculateCircumference(double r){
        if (r <= 0){
            throw new IllegalArgumentException("r не может быть <= 0!");
        }

        return 2 * PI * r;

    }


    public static void main(String[] args) {

        System.out.println("Площадь круга: " + MathConstants.calculateCircleArea(5));
        System.out.println("Длина окружности: " + MathConstants.calculateCircumference(11));
    }



}
