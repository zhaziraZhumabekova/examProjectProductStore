package store;

import store.Product;
import store.productStore.MyException;

import java.util.List;

public interface Service {
    void addNewProduct(List<Product> products);
    void sortByDiscount(List<Product> products1);
    void checkToManager(List<Product> products);
}
