package practice_2;



public class Main {

    public static void main(String[] args) {
        //Класс Car
        Car bmw = new Car("BMW",1995);
        bmw.setYear(2020);
        bmw.print();

        //Класс Rectangle
        Rectangle rectangle = new Rectangle(10,10);
        rectangle.setWidth(15);
        System.out.println("Площадь: " + rectangle.calculateArea());

        //Класс Book
        Book book = new Book("Война и мир", " Л.Толстой");
        book.setAuthor("А.Пушкин");
        book.printInfo();

        //Класс BankAccount
        BankAccount alex = new BankAccount("Alex", 100);
        alex.deposit(1000);
        System.out.println(alex.getBalanceAfterOperation(alex.getBalance()));
        alex.withdraw(500);
        //alex.printBalance();


        //Класс Point
        Point point = new Point(5,8);
        point.setX(10);
        point.print();



        //Класс StudentGroup
        StudentGroup studentGroup = new StudentGroup("Группа физмат",10);
        studentGroup.setStudentCount(20);
        studentGroup.printInfo();


        //Класс Circle
        Circle circle = new Circle(10);
        circle.setRadius(20);
        System.out.println("Площадь: " + circle.calculateArea() + ", окружность: " + circle.calculateCircumference());


        //Класс Teacher
        Teacher teacher = new Teacher("Alex","Математика");
        teacher.setSubject("Биология");
        teacher.printInfo();


        //Класс Product
        Product product = new Product("Лимонад", 90);
        product.setPrice(100);
        product.applyDiscount(20);
        product.getPrice();
       // product.printInfo();


        //Класс Laptop
        Laptop laptop = new Laptop("MSI", 100000);
        laptop.setPrice(99000);
        laptop.printInfo();





    }
}
