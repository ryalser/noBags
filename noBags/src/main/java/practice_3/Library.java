package practice_3;

public class Library {


    private String bookTitle;
    protected String author;
    int year;
    public  String category;

    public Library(String bookTitle, String author, int year, String category){
        this.bookTitle = bookTitle;
        this.author = author;
        this.year = year;
        this.category = category;
    }


    public String getBookTitle (){
        return bookTitle;
    }

    public void setBookTitle(String newBookTitle){
        if (newBookTitle == null){
            throw new IllegalArgumentException("Не указано название книги!");
        }
        this.bookTitle = newBookTitle;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String newAuthor){
        if (newAuthor == null){
            throw new IllegalArgumentException("Не указан автор!");
        }

        this.author = newAuthor;
    }


    public int getYear(){
        return year;
    }

    public void setYear(int newYear){
        if (newYear <= 1900 || newYear > 2025){
            throw new IllegalArgumentException("Год книги некорректный!");
        }

        this.year = newYear;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory (String newCategory){
        if (newCategory == null){
            throw new IllegalArgumentException("Не указана категория!");
        }

        this.category = newCategory;
    }




}
