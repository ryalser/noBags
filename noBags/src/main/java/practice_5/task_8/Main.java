package practice_5.task_8;

public class Main {

    public static void main(String[] args) {

        Museum museum = new Museum();

        Manuscript manuscript = new Manuscript();
        museum.manageExhibit(manuscript);


        Sculpture sculpture = new Sculpture();
        museum.manageExhibit(sculpture);

    }

}
