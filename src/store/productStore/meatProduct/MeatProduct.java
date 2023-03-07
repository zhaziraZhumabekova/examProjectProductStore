package store.productStore.meatProduct;

import store.Product;

import java.time.LocalDate;

public abstract class MeatProduct extends Product {

    public MeatProduct(int id, String name, String companyName, LocalDate localdate) {
        super(id, name, companyName, localdate);
    }
}
