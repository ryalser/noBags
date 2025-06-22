package practice_3;

public class LibraryTest {

    public static void main(String[] args) {
        Library library = new Library("Война и мир", "Л.Н. Толстой",1860,"Художественная литература");


        //Пример проверки сеттера
        library.setAuthor(null);

        //Нельзя обратиться к полю т.к. оно досткпно торлько внутри класса - private
        //library.bookTitle;


        //Можно обратиться к полям т.к. они доступны везде, либо в рамках пакета
        String variable1 = library.category;//public
        String variable2 = library.author;//protected
        int variable3 = library.year;//дефолтный доступ
    }




}
