package complex_task;

import complex_task.task_2.UserValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {


    // Подготовим экземпляр класса
    private UserValidator validator = new UserValidator();

    @Test
    void testCheckNameUser_Valid() {

        assertDoesNotThrow(() -> validator.checkNameUser("John"));
    }

    @Test
    void testCheckUserAge_Valid(){
        assertDoesNotThrow(() -> validator.checkUserAge(25));

    }

    @Test
    void testIsValidEmail_Valid() throws Exception {
        assertTrue(validator.isValidEmail("test@example.com"));
    }
}