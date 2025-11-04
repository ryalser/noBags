package practice_2;

public class Book {
    String title;
    String author;

    //Конструктор
    public Book(String title, String author){
        this.author = author;
        this.title = title;
    }

    //Геттеры
    String getTitle(){
        return this.title;
    }

    String getAuthor(){
        return this.author;
    }



    //Сеттеры
    void setTitle(String newTitle){
        this.title = newTitle;
    }

    void setAuthor(String newAuthor){
        this.author = newAuthor;
    }



    void printInfo(){
        System.out.println("Автор: " + author + ", Название книги: " + title);

    }






}
