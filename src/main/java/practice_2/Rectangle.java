package practice_2;

public class Rectangle {


    double width;
    double height;


    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    double getWidth(){
        return this.width;
    }

    double getHeight(){
        return this.height;
    }


    void setWidth(double newWidth){
        this.width = newWidth;
    }

    public double calculateArea(){
        return width * height;
    }





}



