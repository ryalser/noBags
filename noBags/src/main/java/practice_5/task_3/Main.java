package practice_5.task_3;

public class Main {


    public static void main(String[] args) {
        //создаем меню
        Menu menu = new Menu();

        //формируем меню на сегодня
        HotDish hotDish = new HotDish("Суп",25);
        Drink drink = new Drink("Лимонад",0.5);

        //демонстрируем меню
        System.out.println("Сегодня в меню: ");
        menu.showMenu(hotDish);
        menu.showMenu(drink);
    }

}
