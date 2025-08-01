package practice_7.exception;

// создаем класс исключения
class MainException extends Exception {

    // метод с сообщением исключения
    public MainException(String info) {
        System.out.println("Некорректная операция");
    }

}


// класс с кодом, который выбросит исключение
public class ThrowsException {

  public double division (int a, int b) throws MainException{

      if (a == 0 || b == 0) {
          throw new  MainException ("Некорректная операция");
      } else {
          return a / b;
      }
  }

}

// создаю отдельный класс для запуска расчетов
class checkedException {

    public static void main(String[] args) throws MainException {
        // создаю экземпляр класса ThrowsException, чтобы обращаться к его методам
        ThrowsException throwsException = new ThrowsException();

        // вывожу результат метода делания
        System.out.println(throwsException.division(10,0));
    }
}







