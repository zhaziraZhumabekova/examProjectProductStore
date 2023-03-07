package store.productStore.flourProduct;

import store.Product;

import java.time.LocalDate;

public abstract class FlourProduct extends Product {
    public FlourProduct(int id, String name, String companyName, LocalDate localdate) {
        super(id, name, companyName, localdate);
    }
}
