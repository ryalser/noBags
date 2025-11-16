package complex_task.task_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InventoryService {

    // Флаг валидации
    private boolean isInventoryOpen = true;

    // Общий список товаров, где ключ - категория, значение список объектов Product
    Map<String, List<Product>> listProduct = new HashMap<>();

    /**
     * Метод для добавления товара на склад
     */
    public synchronized void addProduct(Product product){

        if(!isInventoryOpen){
            System.out.println("Добавление товаров недоступно. Проверь флаг: isInventoryOpen.");
            return;
        }

        // Запишем все товары этой категории в лист, если нет - создаем коллекцию
        List <Product> categoriesProduct = listProduct.computeIfAbsent(
                product.getCategory(),
                c -> new ArrayList<>()
        );

        // Добавляем в коллекцию объект Product
        categoriesProduct.add(product);
        System.out.println("Добавили продукт: " + product.getName());
    }


    /**
     * Метод для получения товара по категории
     */
    public List<Product> getProductByCategories(String categories){

        List <Product> categoriesProduct = listProduct.getOrDefault(categories, new ArrayList<>())
                .stream()
                .collect(Collectors.toList());

        if (categoriesProduct == null || categoriesProduct.isEmpty()){
            throw new OutOfStockException("Нет товаров по категории!");
        }

        return categoriesProduct;
    }

    /**
     * Фильтрация по цене
     */

    public List<Product> productListByPrice(String categories, double minPrice){

        List<Product> productList = listProduct.get(categories);
        if (productList == null || productList.isEmpty()){
            return new ArrayList<>();
        }

        System.out.println("Список товаров выше указанной цены: " + minPrice);
       return productList.stream()
                .filter(product -> product.getPrice() > minPrice)
                .collect(Collectors.toList());
    }

}
