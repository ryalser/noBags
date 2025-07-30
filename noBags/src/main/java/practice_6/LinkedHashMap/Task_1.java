package practice_6.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task_1 {

    public static void main(String[] args) {

        Map <Integer,String>  num = new LinkedHashMap();

        num.put(1,"Добавили первым");
        num.put(2,"Добавили Вторым");
        num.put(3,"Добавили Третьим");
        num.put(4,"Добавили Четвертым");
        num.put(5,"Добавили Пятым");


        System.out.println(num);


    }
}
