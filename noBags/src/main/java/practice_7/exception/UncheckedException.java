package practice_7.exception;

public class UncheckedException {

    public static void main(String[] args) {
        Check check = new Check();
        System.out.println("Получен валидный адрес? - " + check.checkMailAddress("123456@mail.ru"));

    }

}

// класс с собственным исключением
class MainUncheckedException extends RuntimeException{

    public MainUncheckedException(String info){
        System.out.println("Непроверяемое исключение");
    }

}

// класс с проверками
class Check {

    // валидный адрес
    public String VALID_ADDRESS = "123456@mail.ru";

    // метод, который проверяет адрес на соответствие VALID_ADDRESS
    public boolean checkMailAddress (String mail) throws MainUncheckedException{

        if (!mail.equals(VALID_ADDRESS)){
            throw new MainUncheckedException("Некорректный адрес");
        } else {
            return true;
        }

    }
}
