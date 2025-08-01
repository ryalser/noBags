package practice_7.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileException {

    public static void main(String[] args) {



        try {
            // открываем файл
            FileReader fileReader = new FileReader("data.txt");

            // ловим исключение
        } catch (FileNotFoundException e){

            // выполняем при исключении
            System.out.println("Файл не найден");
        }



    }


}
