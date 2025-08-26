package complex_task;

import complex_task.task_5.InventoryService;
import complex_task.task_5.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InventoryServiceTest {

    // Подготовка данных
    InventoryService inventoryService = new InventoryService();

    Product product1 = new Product("Вино", 50, "Алкоголь");
    Product product2 = new Product("Коньяк", 240, "Алкоголь");


    @Test
    void testAddProduct() {
        assertDoesNotThrow(() -> inventoryService.addProduct(product1));
    }

    @Test
    void testGetProductByCategories() {

        inventoryService.addProduct(product1);
        inventoryService.addProduct(product2);

        List<Product> result = inventoryService.getProductByCategories("Алкоголь");
        assertEquals(2, result.size());
    }

    @Test
    void testProductListByPrice() {
        //
        inventoryService.addProduct(product1);
        inventoryService.addProduct(product2);

        List<Product> result = inventoryService.productListByPrice("Алкоголь", 60);
        assertEquals(1, result.size());
        assertEquals("Коньяк", result.get(0).getName());
    }
}