package complex_task.task_5;

public class Main {
    public static void main(String[] args) {



        InventoryService inventoryService = new InventoryService();

        //Добавляем продукты
        inventoryService.addProduct(new Product("Молоко", 50,"Молочные продукты"));
        inventoryService.addProduct(new Product("Сыр", 75,"Молочные продукты"));
        inventoryService.addProduct(new Product("Вино", 120,"Алкоголь"));
        inventoryService.addProduct(new Product("Коньяк", 200,"Алкоголь"));

        System.out.println("Показать продукты категории Алкоголь: " +
                inventoryService.getProductByCategories("Алкоголь"));


        System.out.println(inventoryService.productListByPrice("Алкоголь",150));
    }
}
