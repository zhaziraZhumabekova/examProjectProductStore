package store.productStore.milkproduct;

import store.Product;

import java.time.LocalDate;

public abstract class  MilkProduct extends Product {
    public MilkProduct(int id, String name, String companyName, LocalDate localdate) {
        super(id, name, companyName, localdate);
    }
}
