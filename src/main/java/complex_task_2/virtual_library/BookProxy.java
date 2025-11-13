package complex_task_2.virtual_library;

public class BookProxy {
    private Book book;
    private boolean isLoaded; // флаг загрузки содержимого
    private String title;
    private String author;
    private String description;

    public BookProxy(Book book) {
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.description = book.getDescription();
        this.isLoaded = false;
    }

    // Методы без тяжелой загрузки
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    // Метод с ленивой загрузкой
    public String getContent() {
        if (!isLoaded) {
            System.out.println("Загружаем контент книги...");
            String heavyContent = "===Тяжелый контент===";

            book = new Book(title, author, description, heavyContent);
        }
        return book.getContent();
    }
}
