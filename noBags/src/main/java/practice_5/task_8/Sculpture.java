package practice_5.task_8;

public class Sculpture implements Exhibit {


    @Override
    public void manageExhibit() {
        System.out.println("Отправить на реставрацию!");
    }

    @Override
    public void print() {
        System.out.println("Скульптура Петра Великого");

    }
}
