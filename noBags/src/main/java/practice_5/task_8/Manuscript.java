package practice_5.task_8;

public class Manuscript implements Exhibit {

    @Override
    public void manageExhibit (){
        System.out.println("Проверить влажность в месте, где находится Манускрипт!");
    }

    @Override
    public void print() {
        System.out.println("Выводим информацию про манускрипт.");
    }

}
