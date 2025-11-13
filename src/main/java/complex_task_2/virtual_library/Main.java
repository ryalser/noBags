package complex_task_2.virtual_library;

public class Main {
    public static void main(String[] args) {

        // Создаем нашу книгу с помощью "строителя"
        BookBuilder builder = new BookBuilder();

        // Наш строитель "builder" установит все поля(в BookBuilder реализованы сеттеры - ведь он конструктор)
        Book book = builder.setTitle("Война и Мир")
                .setAuthor("Л.Н. Толcтой")
                .setDescription("Описание книги:...")
                .setContent("Тяжелый контент...")
                .build();


        // Доступ к полямЮ которые были установлены имеет прокси - его и используем для вывода информации о книге
        BookProxy bookProxy = new BookProxy(book);

        // Явно пишем вывод в консоль т.к. методы прокси возвращают строку, а не пишут ее в консоль
        System.out.println("Автор книги: " + bookProxy.getAuthor());
        System.out.println("Название книги: " + bookProxy.getTitle());
        System.out.println("Описание книги: " + bookProxy.getDescription());

        // Наш контент
        String content = bookProxy.getContent();
        System.out.println("Наш контент: " + content);
    }
}
