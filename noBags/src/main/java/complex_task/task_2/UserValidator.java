package complex_task.task_2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserValidator {

    // Флаг валидации
    private static boolean validationEnabled = true;


    // Метод текущего состояния валидации
    public boolean getValidationEnabled(){
        return validationEnabled;
    }


    // Проверка имени юзера
    public void checkNameUser(String name) throws InvalidUserException {
         if (name.isEmpty() || !Character.isUpperCase(name.charAt(0))) {
           throw new InvalidUserException(
                    "Валидация имени не пройдена. " +
                           "Имя должно начинаться с заглавной буквы и не быть пустым.");
        }
        System.out.println("Валидация имени пройдена. User.name: " + name);
    }


    // Проверка возраста юзера
    public void checkUserAge(int age) throws InvalidUserException {
        if(age < 18 || age > 100){
            throw new InvalidUserException(
                    "Валидация возраста не пройдена. " +
                            "Возраст должен быть меньше в диапазоне 18-100.");
        }
        System.out.println("Валидация возраста пройдена. User.age: " + age);
    }


    // Проверка почты юзера
    public boolean isValidEmail(String email) throws InvalidUserException {


        // Заимствованные переменные для проверки валидности почты
        final String EMAIL_REGEX = "^[\\w-\\.]+@[\\w-]+\\.[a-zA-Z]{2,}$";
        final Pattern pattern = Pattern.compile(EMAIL_REGEX);

        boolean result = false; // Результат проверки

            Matcher matcher = pattern.matcher(email);
            result = matcher.matches();

            if (email == null || !result){
                throw new InvalidUserException("Почта не указана или указана неверно!");
            } else {
                System.out.println("Почта проверена!");
        }
        return true;
    }


    // Полная валидация
    public void fullUserValidation(User user) throws InvalidUserException {

        // Проверяем состояние флага валидации
       if (validationEnabled == false){
           throw new InvalidUserException("Валидация отключена. Программа игнорирует данные.");
       } else {

           System.out.println("Начинаем валидацию данных для: " + user.getName() );

           checkNameUser(user.getName());
           checkUserAge(user.getAge());
           isValidEmail(user.getEmailUser());

           System.out.println("Валидация данных завершена!");
       }
    }



    // Класс исключений
    class InvalidUserException extends Exception {
        public InvalidUserException(String s) {
            super(s);
        }

    }
}
