package complex_task.task_2;

public class StartProgram {
    public static void main(String[] args) throws UserValidator.InvalidUserException {

        // Создаем валидатор
        UserValidator userValidator = new UserValidator();

        // Передаем на валидацию новых юзеров
        userValidator.fullUserValidation(new User("Ivan", 25,"IvanIvanov@gmail.com"));
        userValidator.fullUserValidation(new User("petr", 18,"petr_@"));

    }
}
